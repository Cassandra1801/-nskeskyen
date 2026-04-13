package com.example.oenskeseddel;

import com.example.oenskeseddel.repositories.WishlistRepository;
import com.example.oenskeseddel.services.WishlistService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;
import com.example.oenskeseddel.models.Wishlist;

import static org.mockito.Mockito.mock;

@SpringBootTest
class OenskeskyenApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shouldCreateWishlist() {
		// Arrange
		WishlistRepository mockRepo = mock(WishlistRepository.class);
		WishlistService service = new WishlistService(mockRepo);

		// Act
		service.createWishlist("Fødselsdagsgaver");

		// Assert
		verify(mockRepo).save(any(Wishlist.class));
	}
}
