package com.online.bootonline;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CellRepository extends JpaRepository<Cell, Integer> {
}
