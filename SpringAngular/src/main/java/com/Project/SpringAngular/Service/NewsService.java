package com.Project.SpringAngular.Service;

import com.Project.SpringAngular.DTO.NewsDTO;
import com.Project.SpringAngular.DTO.NewsSaveDTO;

import java.util.List;

public interface NewsService {


    String addNews(NewsSaveDTO newsSaveDTO);

    List<NewsDTO> getAllNews();
}
