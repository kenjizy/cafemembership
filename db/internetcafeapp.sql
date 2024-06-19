-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2024 at 03:26 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `internetcafeapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `computer`
--

CREATE TABLE `computer` (
  `pc_id` int(100) NOT NULL,
  `pc_name` varchar(100) NOT NULL,
  `pc_status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `computer`
--

INSERT INTO `computer` (`pc_id`, `pc_name`, `pc_status`) VALUES
(1, 'Computer 1', 'Occupied'),
(2, 'Computer 2', 'Occupied'),
(3, 'Computer 3', 'Occupied'),
(4, 'Computer 4', 'Available'),
(5, 'Computer 5', 'Occupied'),
(6, 'Computer 6', 'Available'),
(7, 'Computer 2', 'Occupied');

-- --------------------------------------------------------

--
-- Table structure for table `membership`
--

CREATE TABLE `membership` (
  `m_id` int(100) NOT NULL,
  `u_id` int(100) NOT NULL,
  `start` date NOT NULL,
  `end` date NOT NULL,
  `type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `membership`
--

INSERT INTO `membership` (`m_id`, `u_id`, `start`, `end`, `type`) VALUES
(1, 21, '2025-04-24', '2025-09-24', 'Regular'),
(2, 20, '2025-04-24', '2025-09-24', 'Regular');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(11) NOT NULL,
  `u_name` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_name`, `u_email`, `u_username`, `u_password`, `u_status`, `u_type`, `image`) VALUES
(20, 'james', 'james.ph', 'james', 'mpgIpFE0vGvK0sPQHc7znBIdp5d8UFFJDqcm3Wg+NiE=', 'Active', 'Admin', ''),
(21, 'Angel', 'gel.com', 'gel', 'IYtkvHaQ+sjBj/ZPWe47yQMjl9f2dO1JT4EuRhYoHYY=', 'Active', 'Admin', ''),
(22, 'jandib', 'jandib@gmail.com', 'jandib', '8y4BQwOEKNnU/dl7SycYGoBhonTdi4mwFWlWjLpsnoE=', 'Active', 'Admin', ''),
(23, 'glendon', 'glendon.com', 'glendon', 'LnoYcF3zh/I8kic2h2nUJRQ1cDz4DXoUq1Otc+TRyOs=', 'Pending', 'Admin', 'src/useimages/355532989_650864800405460_7621989516394599513_n.jpg'),
(24, 'donglen', 'donglen.com', 'glen', 'j0SASLgnAHFioAS6xkpWJ8/4LE0LHEZNvSlZ2aXaALA=', 'Pending', 'User', ''),
(27, 'jera', 'jera.com', 'jeralyn', 'ipvPHlHoEtCvhGWo28yfdBBkvwrzs9COawJGQ3wZ9/s=', 'Pending', 'Admin', 'src/useimages/434342223_3666577530226191_7369825452006851190_n.jpg'),
(28, 'Angel Canetee', 'angel@gmail.com', 'angel', 'C3yDfbqSUfGOKJusF/p4/cfghcCQOFjKOVnZEFugZWA=', 'Active', 'Admin', ''),
(29, 'Jeralyn Peritos', 'jera@gmail.com', 'jera', 'OjsK6wYxR6ETOyBjzrrNvVlyRF2jw7lFPz72GsFPrTg=', 'Active', 'User', ''),
(31, '', '', '', '47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=', 'Pending', 'Admin', ''),
(32, 'kent', 'kenken', 'kenjizy', '12345678', 'Active', 'User', '');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `t_id` int(11) NOT NULL,
  `u_id` int(100) NOT NULL,
  `pc_id` int(100) NOT NULL,
  `start` varchar(100) NOT NULL,
  `end` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`t_id`, `u_id`, `pc_id`, `start`, `end`) VALUES
(1, 20, 1, '12:30:20', '15:30:20'),
(2, 20, 3, '23:23:23', '24:23:23'),
(3, 21, 1, '23:00:00', '24:00:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `computer`
--
ALTER TABLE `computer`
  ADD PRIMARY KEY (`pc_id`);

--
-- Indexes for table `membership`
--
ALTER TABLE `membership`
  ADD PRIMARY KEY (`m_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`t_id`),
  ADD KEY `u_id` (`u_id`),
  ADD KEY `pc_id` (`pc_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `computer`
--
ALTER TABLE `computer`
  MODIFY `pc_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `membership`
--
ALTER TABLE `membership`
  MODIFY `m_id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `t_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `transaction_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_user` (`u_id`),
  ADD CONSTRAINT `transaction_ibfk_2` FOREIGN KEY (`pc_id`) REFERENCES `computer` (`pc_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
