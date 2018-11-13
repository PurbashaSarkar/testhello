package com.example.demo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userControllerTest {

	@Mock
	userRepository usrrepo;
	
	@InjectMocks
	userController usrcntlr;
	

//	@Test
//	public void testGetAllUsers() {
//		User usr2 = new User("User2","Data Entry Operator","Normal User","test123");
//		User usr1 = new User("User1","Data Entry Operator","Normal User","test123");
//		List<User> usrlist1 = new ArrayList<>();
//		List<User> usrlist2 = new ArrayList<>();
//		usrlist1.add(usr1);
//		usrlist2.add(usr2);
//		when(usrrepo.findAll()).thenReturn((List<User>) usrlist1);
//		assertEquals(usrlist2, usrcntlr.getAllUsers());
//	}

//	@Test
//	public void testGetAllUsers1() {
//		User usr2 = new User("User2","Data Entry Operator","Normal User","test123");
//		User usr1 = new User("User1","Data Entry Operator","Normal User","test123");
//		when(usrcntlr.getAllUsers()).thenReturn((List<User>) usr2);
//		assertEquals(usr1, usr2);
//	}
	
	
//	@Test
//	public void testFindUsersById() {
//		Optional<User> usr2 =  new(Optional<User>) User("User2","Data Entry Operator","Normal User","test123");
//		when(usrcntlr.findUsersById("311")).thenReturn(usr2);
//	}

}
