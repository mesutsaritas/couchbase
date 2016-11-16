
package com.example.repository;

import java.io.Serializable;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.N1qlSecondaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.example.domain.User;

/**
 * @author msaritas
 *
 */

@Repository
@N1qlSecondaryIndexed(indexName = "userIndexLocal")
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "user", viewName = "all")
public interface UserRepository extends CouchbasePagingAndSortingRepository<User, Serializable> {

     Page<User> findByDeletedFalse(Pageable pageable);

}
