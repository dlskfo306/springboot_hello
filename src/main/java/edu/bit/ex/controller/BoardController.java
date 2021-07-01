package edu.bit.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.bit.ex.service.BoardService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {

    
    @Autowired
    private BoardService boardService;
    
    @GetMapping("/board/list")
	public String list(Model model) {
		log.info("list()..");
		model.addAttribute("list", boardService.getList());
        
        return "list";
	}
    
    @GetMapping("/board/tables")
    public String tables(Model model) {
        log.info("tables()..");
        model.addAttribute("list", boardService.getList());
        
        return "tables";
    }


}
