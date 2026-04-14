/*
package com.example.oenskeseddel;

import com.example.oenskeseddel.models.User;
import com.example.oenskeseddel.models.Wishlist;
import com.example.oenskeseddel.repositories.UserRepository;
import com.example.oenskeseddel.repositories.WishlistRepository;
import com.example.oenskeseddel.services.WishlistService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class OenskeskyenApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private WishlistRepository wishlistRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldCreateWishlist() {
		WishlistRepository mockRepo = mock(WishlistRepository.class);
		WishlistService service = new WishlistService(mockRepo);
		User user = new User("mariam", "mail@test.dk", "Mariam", "secret");

		service.createWishlist(user, "Fødselsdagsgaver");

		verify(mockRepo).save(any(Wishlist.class));
	}

	@Test
	void shouldPersistWishlistWithUser() {
		User user = userRepository.save(new User("anne", "anne@test.dk", "Anne", "secret"));
		Wishlist savedWishlist = wishlistRepository.save(new Wishlist(user, "Jul"));

		Optional<Wishlist> reloadedWishlist = wishlistRepository.findById(savedWishlist.getWishlistId());

		assertTrue(reloadedWishlist.isPresent());
		assertEquals("Jul", reloadedWishlist.get().getName());
		assertEquals("anne", reloadedWishlist.get().getUser().getUsername());
	}
}
*/
