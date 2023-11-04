package com.example.tmdt.repository;

import com.example.tmdt.core.repository_base.BaseRepository;
import com.example.tmdt.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends BaseRepository<Chat>, JpaRepository<Chat, Long> {
}
