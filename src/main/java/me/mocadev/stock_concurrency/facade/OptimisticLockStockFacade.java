package me.mocadev.stock_concurrency.facade;

import lombok.RequiredArgsConstructor;
import me.mocadev.stock_concurrency.service.OptimisticLockStockService;
import org.springframework.stereotype.Service;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-19
 **/
@Service
@RequiredArgsConstructor
public class OptimisticLockStockFacade {

	private final OptimisticLockStockService optimisticLockStockService;

	public void decrease(Long id, Long quantity) throws InterruptedException {
		while (true) {
			try {
				optimisticLockStockService.decrease(id, quantity);
				break;
			} catch (Exception e) {
				System.out.println("재시작 ===================");
				Thread.sleep(50);
			}
		}
	}

}
