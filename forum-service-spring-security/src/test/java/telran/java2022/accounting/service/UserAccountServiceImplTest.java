package telran.java2022.accounting.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.util.ReflectionTestUtils;

import telran.java2022.accounting.dto.UserAccountResponseDto;
import telran.java2022.accounting.dto.UserRegisterDto;
import telran.java2022.accounting.dto.UserUpdateDto;
import telran.java2022.accounting.model.UserAccount;




@ExtendWith(MockitoExtension.class)
public class UserAccountServiceImplTest {

    private UserAccountServiceImpl accountServiceImpl;
    // private Role role;
    // private UserAccount account;
    @Mock private UserAccount newAccount;
    @Mock private PasswordEncoder passwordEncoder;
    @Mock private UserRegisterDto userRegisterDto = new UserRegisterDto("Ann", "123456", "Anny", "Smith");
    @Mock private UserUpdateDto updateDto;
    
    // @BeforeEach
    // public void init() {
    //     accountServiceImpl = new UserAccountServiceImpl(null, null, null);
    //     account = new UserAccount();
    //     ReflectionTestUtils.setField(accountServiceImpl, "passwordEncoder", passwordEncoder);
    //     ReflectionTestUtils.setField(accountServiceImpl, "userRegisterDto", userRegisterDto);
    //     ReflectionTestUtils.setField(accountServiceImpl, "updateDto", updateDto);
    // }

    @Test
    void testAddUser() {
        Boolean isAccountCreatedSuccessfully;
        UserAccountResponseDto expected = new UserAccountResponseDto(userRegisterDto.getLogin(), userRegisterDto.getFirstName(), userRegisterDto.getLastName(), null);
        UserAccountResponseDto response = accountServiceImpl.addUser(userRegisterDto);
        isAccountCreatedSuccessfully =  response.equals(expected);
    assertTrue(isAccountCreatedSuccessfully);
}


    @Test
    void testChangePassword() {

    }

    @Test
    void testChangeRolesList() {

    }

    @Test
    void testEditUser() {

    }

    @Test
    void testGetUser() {

    }

    @Test
    void testRemoveUser() {

    }

    @Test
    void testRun() {

    }
}
