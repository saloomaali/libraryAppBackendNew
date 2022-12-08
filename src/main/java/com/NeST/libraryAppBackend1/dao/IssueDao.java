package com.NeST.libraryAppBackend1.dao;

import com.NeST.libraryAppBackend1.model.IssueBook;
import org.springframework.data.repository.CrudRepository;

public interface IssueDao extends CrudRepository<IssueBook, Integer> {
}
