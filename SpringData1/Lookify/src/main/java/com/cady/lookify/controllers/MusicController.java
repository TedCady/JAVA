package com.cady.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cady.lookify.models.MusicModel;
import com.cady.lookify.services.MusicService;





@Controller
public class MusicController {
	private final MusicService m;
	public MusicController(MusicService m) {
		this.m = m;
	}

	@RequestMapping
	public String reIndex() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String index(Model model) {
		List<MusicModel> M = m.allMusic();
		model.addAttribute("M", M);
		model.addAttribute("Music", M);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/music/new")
	public String showNew(@ModelAttribute("music") MusicModel m) {
		return "new.jsp";
		
	}
	
	@RequestMapping(value = "/music", method = RequestMethod.POST)
	public String createMusic(@Valid @ModelAttribute("music") MusicModel L, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}else {
			m.createMusic(L);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/music/{id}")
	public String readMusic(@PathVariable("id") Long id, Model model, MusicModel L) {
		L = m.findMusic(id);
		model.addAttribute("music", L);
		return "show.jsp";
	}
	
	@RequestMapping(value="/music/{id}/edit", method=RequestMethod.GET)
	public String showEdit(@PathVariable("id") Long id, MusicModel L, Model m) {
		m.addAttribute("music", L);
		return "edit.jsp";
	}
	
	@RequestMapping(value="/music/{id}", method=RequestMethod.PUT)
			public String update(@Valid @ModelAttribute("music")MusicModel L, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			m.updateMusic(L);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping(value="/music/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {
		m.deleteMusic(id);;
		return "redirect:/dashboard";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(@RequestParam("creator") String c, Model model) {
		m.findCreator(c);
		return "redirect:/show";
	}
}
