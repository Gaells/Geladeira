package com.example.Geladeira.service;

import com.example.Geladeira.model.Food;
import com.example.Geladeira.repository.FoodRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    public Food save(Food food) {
        return foodRepository.save(food);
    }

    public void delete(@PathVariable Long id) {
        foodRepository.deleteById(id);
    }

}
