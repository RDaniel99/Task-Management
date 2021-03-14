package edu.fiipractic.tasky.repositories;

import edu.fiipractic.tasky.models.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardsRepository extends CrudRepository<Board, Integer> {
}
