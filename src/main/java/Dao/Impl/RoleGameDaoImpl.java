package Dao.Impl;

import Dao.RoleGameDao;
import app.RoleGame;

import java.util.ArrayList;
import java.util.List;

public class RoleGameDaoImpl implements RoleGameDao {

    private final List<RoleGame> roleGameList = new ArrayList<>();

    {
        roleGameList.add (new RoleGame(1, "DD"));
        roleGameList.add (new RoleGame(2, "Sup"));
    }

    @Override
    public List<RoleGame> findRolesGame() {
        return roleGameList;
    }
}
