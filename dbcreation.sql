CREATE TABLE `documents` (
  `id` CHAR(36) NOT NULL,
  `title` VARCHAR(128) NOT NULL,
  `body` VARCHAR(2048) NOT NULL,
  `document_date` TIMESTAMP NOT NULL,
  `author` VARCHAR(64) NOT NULL,
  PRIMARY KEY (`id`));
  
  INSERT INTO `documents` (`id`, `title`, `body`, `document_date`, `author`) VALUES
('1e8b1a2c-1234-4a5b-8c2d-111111111111', 
 'How to Start with Spring Boot', 
 'Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications. In this post, we will walk through the steps to set up your first Spring Boot project and discuss best practices for configuration and deployment.', 
 '2025-05-21 09:00:00', 
 'Alice'),

('2f9c2b3d-2345-4b6c-9d3e-222222222222', 
 'Understanding REST APIs', 
 'REST APIs are a crucial part of modern web development. This article explains the principles of REST, how to design resource-oriented APIs, and tips for securing and documenting your endpoints.', 
 '2025-05-21 10:30:00', 
 'Bob'),

('3a0d3c4e-3456-4c7d-ad4f-333333333333', 
 'Top 5 Vue.js Features for Beginners', 
 'Vue.js is a progressive JavaScript framework for building user interfaces. In this blog, we explore five features that make Vue.js a great choice for beginners, including its reactivity system, single-file components, and integration with modern tooling.', 
 '2025-05-21 12:00:00', 
 'Charlie');