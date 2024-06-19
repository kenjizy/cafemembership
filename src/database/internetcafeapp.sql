-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2024 at 12:32 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

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
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(11) NOT NULL,
  `u_name` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_name`, `u_email`, `u_username`, `u_password`, `u_status`, `u_type`) VALUES
(20, 'james', 'james.ph', 'james', 'mpgIpFE0vGvK0sPQHc7znBIdp5d8UFFJDqcm3Wg+NiE=', 'Active', 'User'),
(21, 'Angel', 'gel.com', 'gel', 'IYtkvHaQ+sjBj/ZPWe47yQMjl9f2dO1JT4EuRhYoHYY=', 'Active', 'User'),
(22, 'jandib', 'jandib@gmail.com', 'jandib', '8y4BQwOEKNnU/dl7SycYGoBhonTdi4mwFWlWjLpsnoE=', 'Active', 'Admin'),
(23, 'glendon', 'glendon.com', 'glendon', 'LnoYcF3zh/I8kic2h2nUJRQ1cDz4DXoUq1Otc+TRyOs=', 'Active', 'User'),
(24, 'donglen', 'donglen.com', 'glen', 'j0SASLgnAHFioAS6xkpWJ8/4LE0LHEZNvSlZ2aXaALA=', 'Pending', 'User');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
