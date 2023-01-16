package me.mocadev.stock_concurrency.repository;

import me.mocadev.stock_concurrency.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2023-01-16
 **/
public interface StockRepository extends JpaRepository<Stock, Long> {
}
