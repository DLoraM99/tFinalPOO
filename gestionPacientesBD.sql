-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-11-2019 a las 05:19:22
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gestionpacientes`
--
CREATE DATABASE IF NOT EXISTS `gestionpacientes` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `gestionpacientes`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrativos`
--

CREATE TABLE `administrativos` (
  `codigo` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `dni` text NOT NULL,
  `edad` int(11) NOT NULL,
  `sexo` text NOT NULL,
  `telefono` text NOT NULL,
  `correo` text NOT NULL,
  `cargo` text NOT NULL,
  `area` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctores`
--

CREATE TABLE `doctores` (
  `codigo` int(11) NOT NULL,
  `nombre` text CHARACTER SET latin1 NOT NULL,
  `dni` text CHARACTER SET latin1 NOT NULL,
  `edad` int(11) NOT NULL,
  `sexo` text CHARACTER SET latin1 NOT NULL,
  `telefono` text CHARACTER SET latin1 NOT NULL,
  `correo` text CHARACTER SET latin1 NOT NULL,
  `especialidad` text CHARACTER SET latin1 NOT NULL,
  `colegiatura` text CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enfermeros`
--

CREATE TABLE `enfermeros` (
  `codigo` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `dni` text NOT NULL,
  `edad` int(11) NOT NULL,
  `sexo` text NOT NULL,
  `telefono` text NOT NULL,
  `correo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `codigo` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `dni` text NOT NULL,
  `edad` int(11) NOT NULL,
  `sexo` text NOT NULL,
  `telefono` text NOT NULL,
  `correo` text NOT NULL,
  `peso` float NOT NULL,
  `talla` float NOT NULL,
  `condicion` text NOT NULL,
  `estado` text NOT NULL,
  `doctor` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
