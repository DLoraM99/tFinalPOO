-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-11-2019 a las 03:31:34
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

--
-- Volcado de datos para la tabla `administrativos`
--

INSERT INTO `administrativos` (`codigo`, `nombre`, `dni`, `edad`, `sexo`, `telefono`, `correo`, `cargo`, `area`) VALUES
(30001, 'Antonio Castellon', '73659846', 22, 'Masculino', '943267941', 'antonio.castellon@myhospital.com', 'Asistente', 'Medicina General'),
(30002, 'Raquel Leon', '73654502', 21, 'Femenino', '999665331', 'raquel.leon@myhospital.com', 'Asistente', 'Emergencias');

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

--
-- Volcado de datos para la tabla `doctores`
--

INSERT INTO `doctores` (`codigo`, `nombre`, `dni`, `edad`, `sexo`, `telefono`, `correo`, `especialidad`, `colegiatura`) VALUES
(10001, 'Julian Salvador', '091598734', 45, 'Masculino', '999456254', 'julian.salvador@myhospital.com', 'Cardiologia', '06497381342'),
(10002, 'Susana Ramirez', '09189775', 36, 'Femenino', '998576945', 'susana.ramirez@myhospital.com', 'Dermatologia', '098761894781'),
(10003, 'Pedro Sanchez', '08761154', 38, 'Masculino', '985467135', 'pedro.sanchez@myhospital.com', 'Oftamologia', '087649126584'),
(10004, 'Maria Alvarez', '09975568', 46, 'Femenino', '995648945', 'maria.alvarez@myhospital.com', 'Geriatria', '056749138459');

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

--
-- Volcado de datos para la tabla `enfermeros`
--

INSERT INTO `enfermeros` (`codigo`, `nombre`, `dni`, `edad`, `sexo`, `telefono`, `correo`) VALUES
(20001, 'Francisco Suarez', '70489450', 25, 'Masculino', '999154846', 'francisco.suarez@myhospital.com'),
(20002, 'Carlos Navajo', '72184972', 26, 'Masculino', '997548962', 'carlos.navajo@myhospital.com'),
(20003, 'Rafael Vega', '71889750', 23, 'Masculino', '977364520', 'rafael.vega@myhospital.com');

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `codigo` int(11) NOT NULL,
  `contraseña` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`codigo`, `contraseña`) VALUES
(10001, 'PH001'),
(10002, 'PH002'),
(10003, 'PH003'),
(10004, 'PH004'),
(20001, 'EN001'),
(20002, 'EN002'),
(20003, 'EN003'),
(30001, 'AD001'),
(30002, 'AD002');

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
