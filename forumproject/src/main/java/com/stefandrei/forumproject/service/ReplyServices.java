package com.stefandrei.forumproject.service;

import com.stefandrei.forumproject.model.Reply;
import com.stefandrei.forumproject.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ReplyServices {

    @Autowired
    private ReplyRepository replyRepository;

    public List<Reply> findAll() {
        return replyRepository.findAll ();
    }

    public void save(Reply reply) {
        replyRepository.save(reply);
    }

    public Reply findById(Integer id) {
        Optional<Reply> reply = replyRepository.findById (id);
        if (reply.isPresent())
        {
            return reply.get ();
        }
        return null;
    }

    public void deleteById(Integer id) {
        replyRepository.deleteById (id);
    }

}
