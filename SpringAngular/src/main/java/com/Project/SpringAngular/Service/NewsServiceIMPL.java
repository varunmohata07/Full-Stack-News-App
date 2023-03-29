package com.Project.SpringAngular.Service;
import com.Project.SpringAngular.DTO.NewsDTO;
import com.Project.SpringAngular.DTO.NewsSaveDTO;
import com.Project.SpringAngular.NewsRepo.NewsRepo;
import com.Project.SpringAngular.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceIMPL implements NewsService{

   @Autowired
   private NewsRepo newsRepo;
    @Override
    public String addNews(NewsSaveDTO newsSaveDTO) {
        News news = new News(
                newsSaveDTO.getNewstitle(),
                newsSaveDTO.getNewscontent()
                );
        newsRepo.save(news);
        return news.getNewstitle();
    }

    @Override
    public List<NewsDTO> getAllNews() {
        List<News> getNews = newsRepo.findAll();
        List<NewsDTO> newsDTOList = new ArrayList<>();
        for(News a:getNews)
        {
            NewsDTO newsDTO = new NewsDTO(

                    a.getNewsid(),
                    a.getNewstitle(),
                    a.getNewscontent()


            );
            newsDTOList.add(newsDTO);
        }

        return newsDTOList;

    }

}
