package com.sparta.amenityclonecoding.repository;

import com.sparta.amenityclonecoding.entity.ReviewImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewImgRepository extends JpaRepository<ReviewImg, Long> {
}
