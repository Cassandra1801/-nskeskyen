package com.example.oenskeseddel;

import com.example.oenskeseddel.models.User;
import com.example.oenskeseddel.models.Wishlist;
import com.example.oenskeseddel.repositories.UserRepository;
import com.example.oenskeseddel.repositories.WishlistRepository;
import com.example.oenskeseddel.services.WishlistService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

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
    void shouldCreateWishlistForUserId() {
        // Arrange
        WishlistRepository wishlistRepo = mock(WishlistRepository.class);
        UserRepository userRepo = mock(UserRepository.class);

        WishlistService service = new WishlistService(wishlistRepo, userRepo);

        Integer userId = 1;
        User testUser = new User("testuser", "testuser@mail.com", "Test User", "1234");
        testUser.setUserId(userId);

        when(userRepo.findById(userId)).thenReturn(Optional.of(testUser));

        // Act
        service.createWishlist(userId, "Fødselsdagsgaver");

        // Assert
        verify(userRepo).findById(userId);                 // service must load the user
        verify(wishlistRepo).save(any(Wishlist.class));    // service must save a wishlist
    }
}
