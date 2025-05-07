-- phpMyAdmin SQL Dump
-- version 5.2.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 06, 2025 at 05:01 PM
-- Server version: 8.0.39
-- PHP Version: 8.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `l4g_player_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `players`
--

CREATE DATABASE IF NOT EXISTS l4g_player_db;
USE l4g_player_db;

CREATE TABLE `players` (
  `player_id` int NOT NULL,
  `bio` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `distance_willing_to_travel` double NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `location` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `preferred_game_style` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `role_type` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `status` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `username` varchar(255) COLLATE utf8mb4_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `players`
--

INSERT INTO `players` (`player_id`, `bio`, `created_at`, `distance_willing_to_travel`, `email`, `location`, `password`, `preferred_game_style`, `role_type`, `status`, `username`) VALUES
(7, 'Always plays tanks', '2025-04-01 13:49:40.000000', 15, 'dragonborn42@example.com', 'Chicago', 'securePass123', 'Combat-heavy\nanything goes', 'Customer', 'active', 'dragonborn42'),
(8, 'Lover of ranged classes', '2025-04-01 13:49:40.000000', 10, 'elven.archer@example.com', 'Seattle', 'arrowRain!', 'Roleplay-heavy', 'Customer', 'active', 'elvenArcher'),
(9, 'Rolls nat 1s often', '2025-04-01 13:49:40.000000', 20, 'dice.master@example.com', 'Denver', 'rollForFun!', 'Balanced', 'Customer', 'active', 'diceMaster'),
(10, 'Big spells, small package', '2025-04-01 13:49:40.000000', 25, 'gnomewizard@example.com', 'Boston', 'fireball4days', 'Magic-focused', 'Customer', 'active', 'gnomeWizard'),
(11, 'Smash first, ask later', '2025-04-01 13:49:40.000000', 30, 'orcbarb@example.com', 'Atlanta', 'rAgeMode!', 'Action-heavy', 'Customer', 'active', 'orcBarbarian'),
(12, 'New to DND, excited to play!', '2025-04-01 00:00:00.000000', 25, 'dndplayer112@example.com', 'Raleigh, NC', 'dragon123', 'Casual', 'Customer', 'active', 'dndplayer1323'),
(13, 'New to DND, excited to play!', '2025-04-01 00:00:00.000000', 25, 'dragonslayer99@example.com', 'Raleigh, NC', 'dragonforlife', 'Casual', 'Customer', 'active', 'thedragonslayer'),
(15, 'Optional bio', '2025-04-24 19:29:25.463000', 25, 'killerhehe@icloud.com', 'greensboro nc', 'placeholder123', 'prefer to play rogue', 'Customer', 'active', 'Killerofall'),
(16, 'hi ill fill this in later', '2025-04-24 19:36:26.563000', 25, 'dragonsss@icloud.com', 'greensboro', 'ilovedragons', 'i prefer to be a rogue', 'Customer', 'active', 'dragonslayer');

-- --------------------------------------------------------

--
-- Table structure for table `player_active_games_ids`
--

CREATE TABLE `player_active_games_ids` (
  `player_player_id` int NOT NULL,
  `active_games_ids` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `player_active_games_ids`
--

INSERT INTO `player_active_games_ids` (`player_player_id`, `active_games_ids`) VALUES
(12, 1001),
(12, 1002),
(13, 1001),
(13, 1002),
(13, 2001);

-- --------------------------------------------------------

--
-- Table structure for table `player_available_times`
--

CREATE TABLE `player_available_times` (
  `player_player_id` int NOT NULL,
  `available_times` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `player_available_times`
--

INSERT INTO `player_available_times` (`player_player_id`, `available_times`) VALUES
(12, 'Evenings'),
(12, 'Weekends'),
(13, 'Evenings'),
(13, 'Weekends');

-- --------------------------------------------------------

--
-- Table structure for table `player_recent_events_attended`
--

CREATE TABLE `player_recent_events_attended` (
  `player_player_id` int NOT NULL,
  `recent_events_attended` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `player_recent_events_attended`
--

INSERT INTO `player_recent_events_attended` (`player_player_id`, `recent_events_attended`) VALUES
(12, 'Spring One-Shot'),
(12, 'March Meetup'),
(13, 'Spring One-Shot'),
(13, 'March Meetup');

-- --------------------------------------------------------

--
-- Table structure for table `player_reviews_written`
--

CREATE TABLE `player_reviews_written` (
  `player_player_id` int NOT NULL,
  `reviews_written` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `player_reviews_written`
--

INSERT INTO `player_reviews_written` (`player_player_id`, `reviews_written`) VALUES
(12, 'Fun session!'),
(12, 'Great DM.'),
(13, 'Fun session!'),
(13, 'Great DM.');

-- --------------------------------------------------------

--
-- Table structure for table `reviews`
--

CREATE TABLE `reviews` (
  `review_id` bigint NOT NULL,
  `player_id` bigint NOT NULL,
  `rating` int NOT NULL,
  `review_text` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `submitted_at` datetime(6) DEFAULT NULL,
  `venue_id` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reviews`
--

INSERT INTO `reviews` (`review_id`, `player_id`, `rating`, `review_text`, `submitted_at`, `venue_id`) VALUES
(1, 1, 5, 'Amazing venue with super friendly staff!', NULL, NULL),
(2, 2, 4, 'Tables were a bit small but great atmosphere overall.', NULL, NULL),
(3, 3, 5, 'Had an awesome time—DM was super engaging!', NULL, NULL),
(4, 4, 3, 'Nice place, but parking was a nightmare.', NULL, NULL),
(5, 1, 5, 'Would definitely come back for another campaign.', NULL, NULL),
(6, 1, 1, 'hello', '2025-04-24 19:24:54.962000', 1),
(7, 1, 1, 'hello', '2025-04-24 19:36:50.510000', 1),
(8, 1, 1, 'this is a test', '2025-04-24 19:37:57.085000', 1),
(9, 1, 5, 'not a big fan. im a huge fan! lol', '2025-04-24 19:42:49.270000', 1),
(10, 1, 5, 'great place', '2025-04-24 20:06:39.198000', 2),
(11, 7, 1, 'hmmmm', '2025-04-24 20:10:07.196000', 1),
(12, 7, 1, 'popop', '2025-04-24 20:27:08.422000', 1),
(13, 7, 1, 'hello', '2025-05-03 19:33:36.146000', 1),
(14, 7, 1, 'boooo', '2025-05-06 02:46:56.337000', 1),
(15, 7, 1, 'henlo', '2025-05-06 02:51:52.025000', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `players`
--
ALTER TABLE `players`
  ADD PRIMARY KEY (`player_id`),
  ADD UNIQUE KEY `UKpnrwm9bkjel7qss1ekm05j953` (`email`),
  ADD UNIQUE KEY `UKp1chj5w2v1nune5xmmd94u1yj` (`username`);

--
-- Indexes for table `player_active_games_ids`
--
ALTER TABLE `player_active_games_ids`
  ADD KEY `FKe62kjjnb3m6xu07saymsf7en` (`player_player_id`);

--
-- Indexes for table `player_available_times`
--
ALTER TABLE `player_available_times`
  ADD KEY `FKaxcmm61a2qj2k9f8joh12t8a9` (`player_player_id`);

--
-- Indexes for table `player_recent_events_attended`
--
ALTER TABLE `player_recent_events_attended`
  ADD KEY `FKica0lslp5iecfspwyi4v166m1` (`player_player_id`);

--
-- Indexes for table `player_reviews_written`
--
ALTER TABLE `player_reviews_written`
  ADD KEY `FKr36sxjrflcs7qgs94ipjhf3x7` (`player_player_id`);

--
-- Indexes for table `reviews`
--
ALTER TABLE `reviews`
  ADD PRIMARY KEY (`review_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `players`
--
ALTER TABLE `players`
  MODIFY `player_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `reviews`
--
ALTER TABLE `reviews`
  MODIFY `review_id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `player_active_games_ids`
--
ALTER TABLE `player_active_games_ids`
  ADD CONSTRAINT `FKe62kjjnb3m6xu07saymsf7en` FOREIGN KEY (`player_player_id`) REFERENCES `players` (`player_id`);

--
-- Constraints for table `player_available_times`
--
ALTER TABLE `player_available_times`
  ADD CONSTRAINT `FKaxcmm61a2qj2k9f8joh12t8a9` FOREIGN KEY (`player_player_id`) REFERENCES `players` (`player_id`);

--
-- Constraints for table `player_recent_events_attended`
--
ALTER TABLE `player_recent_events_attended`
  ADD CONSTRAINT `FKica0lslp5iecfspwyi4v166m1` FOREIGN KEY (`player_player_id`) REFERENCES `players` (`player_id`);

--
-- Constraints for table `player_reviews_written`
--
ALTER TABLE `player_reviews_written`
  ADD CONSTRAINT `FKr36sxjrflcs7qgs94ipjhf3x7` FOREIGN KEY (`player_player_id`) REFERENCES `players` (`player_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
