package com.Project.SpringAngular.entity;
import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @Column(name = "news_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int newsid;

    @Column(name = "news_title", length = 200)
    private String newstitle;

    @Column(name = "news_content", length = 300)
    private String newscontent;

    public News(int newsid, String newstitle, String newscontent) {
        this.newsid = newsid;
        this.newstitle = newstitle;
        this.newscontent = newscontent;
    }

    public News(String newstitle, String newscontent) {
        this.newstitle = newstitle;
        this.newscontent = newscontent;
    }

    public News() {
    }

    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsid=" + newsid +
                ", newstitle='" + newstitle + '\'' +
                ", newscontent='" + newscontent + '\'' +
                '}';
    }
}