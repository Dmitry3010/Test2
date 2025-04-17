package Dao;

import App.Character;

import java.util.List;

public interface CharacterDao {

    void save (Character character);
    List<Character> findAllCharacter();
    Character findCharacterByName(String name);
    Character findCharacterById(int characterId);
//    boolean findCharacterByName(String name, int age);
    List<Character> findCharactersByPositionIdAndRoleId(int positionId, int roleId);
}
