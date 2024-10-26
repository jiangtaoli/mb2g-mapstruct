package guru.springframework.mappers;

import guru.springframework.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import guru.springframework.domain.User;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);
}
