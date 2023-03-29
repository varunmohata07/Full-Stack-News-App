package com.Project.SpringAngular.NewsRepo;

import com.Project.SpringAngular.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepo extends JpaRepository<News,Integer> {
}
