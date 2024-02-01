-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 31, 2024 at 10:25 AM
-- Server version: 5.7.40
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotelaria_imetro`
--
CREATE DATABASE IF NOT EXISTS `hotelaria_imetro` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `hotelaria_imetro`;

-- --------------------------------------------------------

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
CREATE TABLE IF NOT EXISTS `administrador` (
  `IDUsuario` int(11) NOT NULL,
  PRIMARY KEY (`IDUsuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `administrador`
--

INSERT INTO `administrador` (`IDUsuario`) VALUES
(1),
(2);

-- --------------------------------------------------------

--
-- Table structure for table `checkinout`
--

DROP TABLE IF EXISTS `checkinout`;
CREATE TABLE IF NOT EXISTS `checkinout` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `IDHospede` int(11) DEFAULT NULL,
  `DataHora` datetime DEFAULT NULL,
  `Procedimentos` varchar(255) DEFAULT NULL,
  `InformacoesDeposito` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `IDHospede` (`IDHospede`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `preferenciasalimentares`
--

DROP TABLE IF EXISTS `preferenciasalimentares`;
CREATE TABLE IF NOT EXISTS `preferenciasalimentares` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Preferencias` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `quartos`
--

DROP TABLE IF EXISTS `quartos`;
CREATE TABLE IF NOT EXISTS `quartos` (
  `NumeroQuarto` int(11) NOT NULL AUTO_INCREMENT,
  `CondicaoQuarto` varchar(50) DEFAULT NULL,
  `TipoQuarto` varchar(50) DEFAULT NULL,
  `Capacidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`NumeroQuarto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
CREATE TABLE IF NOT EXISTS `reservas` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NomeHospede` varchar(50) DEFAULT NULL,
  `DataEntrada` varchar(10) DEFAULT NULL,
  `DataSaida` varchar(10) DEFAULT NULL,
  `Preferencias` text,
  `TipoQuartoEscolhido` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Telefone` int(11) DEFAULT NULL,
  `Endereco` varchar(50) DEFAULT NULL,
  `IDusuario` int(11) DEFAULT NULL,
  `IDQuarto` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `IDusuario` (`IDusuario`),
  KEY `IDQuarto` (`IDQuarto`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservas`
--

INSERT INTO `reservas` (`ID`, `NomeHospede`, `DataEntrada`, `DataSaida`, `Preferencias`, `TipoQuartoEscolhido`, `Email`, `Telefone`, `Endereco`, `IDusuario`, `IDQuarto`) VALUES
(3, 'teste', NULL, 'teste', 'teste', 'teste', 'teste', 0, 'teste', NULL, NULL),
(4, 'Cleodice Jussara', '24-02-2024', '25-02-2024', 'Quarto com vista para cidade', 'Suite', 'cleodicejussara@gmail.com', 930823551, 'Viana', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `transacoesfinanceiras`
--

DROP TABLE IF EXISTS `transacoesfinanceiras`;
CREATE TABLE IF NOT EXISTS `transacoesfinanceiras` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `IDReserva` int(11) DEFAULT NULL,
  `InformacoesPagamento` varchar(255) DEFAULT NULL,
  `Montante` double DEFAULT NULL,
  `DataHora` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `IDReserva` (`IDReserva`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `IDUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  `Telefone` varchar(15) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Senha` varchar(255) DEFAULT NULL,
  `Endereco` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`IDUsuario`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`IDUsuario`, `Nome`, `Telefone`, `Email`, `Senha`, `Endereco`) VALUES
(1, 'teste', 'Telefone', 'teste', 'teste', 'teste'),
(2, 'Braulio MacMahon', 'Telefone', 'brauliomacmahon@gmail.com', 'palavrapasse', 'Morro Bento');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
