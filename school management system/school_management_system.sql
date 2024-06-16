-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 11:16 AM
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
-- Database: `school_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `addstudent`
--

CREATE TABLE `addstudent` (
  `ID` varchar(25) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Father_Name` varchar(200) NOT NULL,
  `Phone` varchar(200) NOT NULL,
  `Father_Phone` varchar(10) NOT NULL,
  `Class` varchar(15) NOT NULL,
  `Roll_Number` varchar(10) NOT NULL,
  `Address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `addstudent`
--

INSERT INTO `addstudent` (`ID`, `Name`, `Father_Name`, `Phone`, `Father_Phone`, `Class`, `Roll_Number`, `Address`) VALUES
('12', 'Lahiru Lakmal Abewickrama', 'K.G.Abewickrama', '0784415698', '0742536852', 'Class  C', '205', 'Gonagama, Henapolla, Matara'),
('14', 'Bhagya Kaumadi Dissanayaka', 'D.M.Kumara Dissanayaka', '0774545123', '0714152879', 'Class  B', '120', 'NO.102 , Gonakubura, Kurunegala'),
('25', 'Pramuditha Udayanga Banadara', 'D.K.G.Banadara', '0778589863', '0745823269', 'Class  E', '30', 'Henepola, Pamunuwathna'),
('32', 'Ireshika Sewwandi Premarathna', 'E.M.A.Premarathna', '0784512369', '0774895123', 'Class  C', '201', 'Kandiyapita, Kotaweheramankada, Balangoda');

-- --------------------------------------------------------

--
-- Table structure for table `addteacher`
--

CREATE TABLE `addteacher` (
  `ID` varchar(10) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `specialization` varchar(200) NOT NULL,
  `Subject_Assigned` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `addteacher`
--

INSERT INTO `addteacher` (`ID`, `Name`, `specialization`, `Subject_Assigned`) VALUES
('19', 'Thilina Smanarasinghe', 'Encouraging Discussions', 'I.C.T'),
('26', 'Nethmi Sewwandi', 'Encouraging Discussions', 'Science'),
('30', 'Vihanga Sudesh', 'Giving Lectures', 'Tamil'),
('45', 'Malkanthi Gunarathna', 'Demonstrating Tasks', 'Tamil'),
('50', 'Pubudu Senanayaka', 'Demonstrating Tasks', 'I.C.T');

-- --------------------------------------------------------

--
-- Table structure for table `basic_info`
--

CREATE TABLE `basic_info` (
  `Full_Name` varchar(200) NOT NULL,
  `Name_with_initials` varchar(200) NOT NULL,
  `NIC_No` varchar(15) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Moblie_No` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `basic_info`
--

INSERT INTO `basic_info` (`Full_Name`, `Name_with_initials`, `NIC_No`, `Address`, `Moblie_No`) VALUES
('Dewmini Karunathilaka', 'M.S.D.Karunathilaka', '2001349093', 'Navagama,Bulathsinhala', '0779994960'),
('Dissanayaka Mudiyanselage Iresha Ruwanthi', 'D.M.I.Ruwanthi', '2001451875', 'Mathara, Godagama', '0789658552'),
('Nethmi Vihanga Gajaweera', 'N.V.Gajaweera', '2001775816', 'Munagama,Horana', '0770124960'),
('Yasasmi Sewwandi Karunarathna', 'Y.S.Karunarathna', '2001567093', 'Diyagama,Rathnapura', '0786994960');

-- --------------------------------------------------------

--
-- Table structure for table `feesubmit`
--

CREATE TABLE `feesubmit` (
  `Id` varchar(20) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Month_Name` varchar(20) NOT NULL,
  `Annual_Fee` varchar(20) NOT NULL,
  `Sport_Fee` varchar(20) NOT NULL,
  `Library_Fee` varchar(20) NOT NULL,
  `Monthi_Fee` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `feesubmit`
--

INSERT INTO `feesubmit` (`Id`, `Name`, `Month_Name`, `Annual_Fee`, `Sport_Fee`, `Library_Fee`, `Monthi_Fee`) VALUES
('12', 'Sachini Wathsala', 'April', '14500', '1200', '700', '650'),
('13', 'Tharushi Bhagya', 'May', '20000', '1000', '800', '600'),
('14', 'Dasuni Dananjali', 'March', '18000', '1100', '700', '500'),
('15', 'Nimthara Keshani', 'July', '30000', '900', '690', '600'),
('16', 'Upeksha Madubhashini', 'November', '25000', '1100', '500', '600'),
('18', 'Dasun\r\n', 'May', '25000', '1200', '800', '2500');

-- --------------------------------------------------------

--
-- Table structure for table `reportcard`
--

CREATE TABLE `reportcard` (
  `ID` int(20) NOT NULL,
  `Roll_Number` int(15) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Class` int(200) NOT NULL,
  `Physics` int(5) NOT NULL,
  `Maths` int(5) NOT NULL,
  `Chemistry` int(5) NOT NULL,
  `grade` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reportcard`
--

INSERT INTO `reportcard` (`ID`, `Roll_Number`, `Name`, `Class`, `Physics`, `Maths`, `Chemistry`, `grade`) VALUES
(14, 123, 'Gayani Dananjani', 12, 65, 77, 61, 'B'),
(15, 79, 'Irosh Madhushan Pathmasiri', 12, 45, 30, 59, 'D'),
(17, 342, 'Snuki Tharunya', 11, 41, 33, 29, 'Fail'),
(22, 205, 'Sewwandi balasuriya', 12, 78, 88, 45, 'A');

-- --------------------------------------------------------

--
-- Table structure for table `sign_up`
--

CREATE TABLE `sign_up` (
  `User_Name` varchar(200) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Security_Question` varchar(200) NOT NULL,
  `Answer` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sign_up`
--

INSERT INTO `sign_up` (`User_Name`, `Password`, `Security_Question`, `Answer`) VALUES
('Nethmi Vihanga', '19951230', 'What is your favorite food?', 'Ramen'),
('Miinuri Imasha', '20010410', 'What your school name?', 'Panadura Balika'),
('Iresha', '789', 'What is your home town?', 'mathara');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addstudent`
--
ALTER TABLE `addstudent`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `addteacher`
--
ALTER TABLE `addteacher`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `basic_info`
--
ALTER TABLE `basic_info`
  ADD PRIMARY KEY (`Full_Name`);

--
-- Indexes for table `feesubmit`
--
ALTER TABLE `feesubmit`
  ADD PRIMARY KEY (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
