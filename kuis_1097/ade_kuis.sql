-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.22
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ade_kuis`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1097`
--

CREATE TABLE `identitas_1097` (
  `nim` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `prodi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1097`
--

INSERT INTO `identitas_1097` (`nim`, `alamat`, `nama`, `prodi`) VALUES
(1555301097, 'jl rajawali sakti', 'ade sukma', 'teknik informatika'),
(1555301105, 'jl awal', 'exi', 'elektronika');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1097`
--

CREATE TABLE `ipk_1097` (
  `id` bigint(20) NOT NULL,
  `ipk` int(11) DEFAULT NULL,
  `semester` varchar(255) DEFAULT NULL,
  `identitas_nim` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1097`
--

INSERT INTO `ipk_1097` (`id`, `ipk`, `semester`, `identitas_nim`) VALUES
(1, 4, 'Semester 3', 1555301097),
(3, 3, 'Semester 1', 1555301097);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1097`
--
ALTER TABLE `identitas_1097`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `ipk_1097`
--
ALTER TABLE `ipk_1097`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKi09hlh6o1yh5xuarxy0jnyojq` (`identitas_nim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1097`
--
ALTER TABLE `identitas_1097`
  MODIFY `nim` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1555301106;
--
-- AUTO_INCREMENT for table `ipk_1097`
--
ALTER TABLE `ipk_1097`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1097`
--
ALTER TABLE `ipk_1097`
  ADD CONSTRAINT `FKi09hlh6o1yh5xuarxy0jnyojq` FOREIGN KEY (`identitas_nim`) REFERENCES `identitas_1097` (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
