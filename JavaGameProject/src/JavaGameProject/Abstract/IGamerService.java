package JavaGameProject.Abstract;

import JavaGameProject.Entities.Gamer;

public interface IGamerService {
	void register(Gamer gamer);
    void delete(Gamer gamer);
    void update(Gamer gamer);
}
