-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2024 at 04:48 AM
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
-- Database: `atm`
--

-- --------------------------------------------------------

--
-- Table structure for table `rekening`
--

CREATE TABLE `rekening` (
  `Nama` varchar(100) NOT NULL,
  `NIK` varchar(16) NOT NULL,
  `TTL` date NOT NULL,
  `Alamat` varchar(200) NOT NULL,
  `No` varchar(16) NOT NULL,
  `saldo` double NOT NULL,
  `Pin` varchar(4) NOT NULL,
  `Norekening` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rekening`
--

INSERT INTO `rekening` (`Nama`, `NIK`, `TTL`, `Alamat`, `No`, `saldo`, `Pin`, `Norekening`) VALUES
('2024-11-13', '2024-11-13', '2024-11-13', '2024-11-13', '129314', 2038936, '1234', 65127),
('hafizz', '1234567890123456', '2024-11-13', '2024-11-13', '811', 2.000000001958664e15, '3456', 97778);

-- --------------------------------------------------------

--
-- Table structure for table `riwayat`
--

CREATE TABLE `riwayat` (
  `NoRekening` varchar(6) NOT NULL,
  `jumlah` bigint(20) NOT NULL,
  `Tipe` varchar(20) NOT NULL,
  `TransaksiID` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `riwayat`
--

INSERT INTO `riwayat` (`NoRekening`, `jumlah`, `Tipe`, `TransaksiID`) VALUES
('97778', 1234, 'Transfer Keluar', '08fef0'),
('65127', 1234, 'Transfer Masuk', '3581a0'),
('97778', 200, 'Ditarik', '558a59'),
('97778', 200, 'Ditarik', '5ca9aa'),
('97778', 1234, 'Transfer Keluar', '93581a'),
('97778', 2000000000000000, 'Ditarik', 'e0307b');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rekening`
--
ALTER TABLE `rekening`
  ADD PRIMARY KEY (`Norekening`);

--
-- Indexes for table `riwayat`
--
ALTER TABLE `riwayat`
  ADD PRIMARY KEY (`TransaksiID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
