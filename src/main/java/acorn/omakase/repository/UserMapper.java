package acorn.omakase.repository;

import acorn.omakase.domain.User;

import acorn.omakase.dto.userdto.DeleteIdRequest;
import acorn.omakase.dto.userdto.FindIdRequest;

import acorn.omakase.dto.userdto.LoginRequest;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getUserList();

    void signup(User user);


    String findId(FindIdRequest findid);

    User login(LoginRequest loginRequest);


    // 회원 탈퇴
    int deleteId(Long userId);
    // 비밀번호 가져오기(회원탈퇴)
    String getPw(Long userId);

}