-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 24-Out-2019 às 02:14
-- Versão do servidor: 5.5.60
-- versão do PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `academia2`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `abdome`
--

DROP TABLE IF EXISTS `abdome`;
CREATE TABLE IF NOT EXISTS `abdome` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `abdome`
--

INSERT INTO `abdome` (`id`, `descricao`) VALUES
(5, 'TREINO TESTE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `antebraco`
--

DROP TABLE IF EXISTS `antebraco`;
CREATE TABLE IF NOT EXISTS `antebraco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `antebraco`
--

INSERT INTO `antebraco` (`id`, `descricao`) VALUES
(2, 'TREINO TESTE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `biceps`
--

DROP TABLE IF EXISTS `biceps`;
CREATE TABLE IF NOT EXISTS `biceps` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `biceps`
--

INSERT INTO `biceps` (`id`, `descricao`) VALUES
(2, 'TREINO BICEPS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `apelido` varchar(20) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `logradouro` varchar(60) NOT NULL,
  `numero` int(11) NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `dataNascimento` varchar(10) NOT NULL,
  `idMatricula` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `apelido`, `cpf`, `telefone`, `logradouro`, `numero`, `bairro`, `cidade`, `estado`, `dataNascimento`, `idMatricula`) VALUES
(12, 'ANTONIO RONY MARCELINO ANDRADE', 'RONY', '057.702.063-30', '(88)9.9210-0782', 'VILA PALMEIRA', 22, 'BURITIZINHO', 'MAURITI', 'CE', '07/06/1995', '2292019102217'),
(13, 'RODRIGO MARCELINO ANDRADE', 'RODRIGO', '057.702.063-30', '(88)9.9210-0782', 'VILA PALMEIRA ', 22, 'BURITIZINHO', 'MAURITI', 'CE', '04/05/2019', '1210201911588'),
(14, 'NOVO CLIENTE TESTE', 'TESTE', '057.702.063-30', '(88)9.9210-0782', 'VILA DAS PALMEIRINHAS', 44, 'BURITEX', 'MAURITI', 'CE', '25/10/2019', '13102019105728'),
(15, 'mais um teste', 'teste', '057.702.063-30', '(88)9.9210-0875', 'teste', 22, 'teste', 'cdas', 'CE', '25/05/2019', '131020191164'),
(16, 'hhjsadjhsad', 'jjksadsa', '057.702.063-30', '(88)8.8888-8888', '88888', 888, '8888', '8888', 'CE', '25/10/2019', '13102019111039'),
(17, 'mais um', 'mais um', '057.702.063-30', '(88)9.9952-2222', '56565', 5656, '5656565656', '6565656', 'CE', '20/10/1995', '131020190250'),
(18, 'nndasnka', 'nskdnak', '057.702.063-30', '(88)9.9210-0782', '555', 55, '55', '55', 'CE', '25/05/1998', '131020190393');

-- --------------------------------------------------------

--
-- Estrutura da tabela `coxa`
--

DROP TABLE IF EXISTS `coxa`;
CREATE TABLE IF NOT EXISTS `coxa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `coxa`
--

INSERT INTO `coxa` (`id`, `descricao`) VALUES
(2, 'TREINO COXA');

-- --------------------------------------------------------

--
-- Estrutura da tabela `deltoides`
--

DROP TABLE IF EXISTS `deltoides`;
CREATE TABLE IF NOT EXISTS `deltoides` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `deltoides`
--

INSERT INTO `deltoides` (`id`, `descricao`) VALUES
(2, 'TREINO DELTOIDES');

-- --------------------------------------------------------

--
-- Estrutura da tabela `dorsais`
--

DROP TABLE IF EXISTS `dorsais`;
CREATE TABLE IF NOT EXISTS `dorsais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `dorsais`
--

INSERT INTO `dorsais` (`id`, `descricao`) VALUES
(2, 'TREINO DORSAL');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ficha`
--

DROP TABLE IF EXISTS `ficha`;
CREATE TABLE IF NOT EXISTS `ficha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `matricula` varchar(40) NOT NULL,
  `dataEntrada` varchar(15) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `peso` float NOT NULL,
  `altura` float NOT NULL,
  `idade` int(3) NOT NULL,
  `frequenciaCardiaca` float NOT NULL,
  `frequenciaCardMaxima` float NOT NULL,
  `batimentos` varchar(5) NOT NULL,
  `problemaSaude` varchar(30) NOT NULL,
  `medicacao` varchar(30) NOT NULL,
  `acompanhamento` varchar(8) NOT NULL,
  `objetivo` varchar(30) NOT NULL,
  `profissao` varchar(20) NOT NULL,
  `idModeloFicha` int(30) NOT NULL,
  `idCliente` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `ficha`
--

INSERT INTO `ficha` (`id`, `matricula`, `dataEntrada`, `sexo`, `peso`, `altura`, `idade`, `frequenciaCardiaca`, `frequenciaCardMaxima`, `batimentos`, `problemaSaude`, `medicacao`, `acompanhamento`, `objetivo`, `profissao`, `idModeloFicha`, `idCliente`) VALUES
(7, '2292019102217', '22/09/2019', 'MASCULINO', 97, 1.66, 24, 80, 80, '80', 'SIM', 'NENHUMA', 'SIM', 'PERDER 20 QUILOS5', 'ANALISTA DE SISTEMAS', 1, 12),
(8, '1210201911588', '12/10/2019', 'MASCULINO', 97, 1.7, 21, 80, 80, '80', 'SIM', 'SIM', 'SIM', 'PERDER 20 KG', 'ADVOGADO', 2, 13),
(9, '13102019105728', '14/10/2019', 'MASCULINO', 89, 1.68, 25, 80, 80, '80', 'SIM', 'HIPERTENÇÃO', 'SIM', 'PERDER 20 QUILOS', 'PROGRAMADOR WEB', 2, 14),
(10, '131020191164', '15/10/2019', 'MASCULINO', 55, 1.6, 30, 75, 80, '90', 'SIM', 'asda', 'SIM', 'sdad', 'adas', 2, 15),
(11, '13102019111039', '20/05/2019', 'MASCULINO', 80, 1.66, 65, 90, 90, '90', 'SIM', '12212', 'SIM', '1212', '1212', 2, 16),
(12, '131020190250', '25/10/2019', 'MASCULINO', 60, 60, 60, 60, 60, '6', 'SIM', '60', 'SIM', '06', '06', 2, 17),
(13, '131020190393', '13/10/2019', 'MASCULINO', 55, 55, 55, 55, 55, '55', 'SIM', '55', 'SIM', '55', '55', 2, 18);

-- --------------------------------------------------------

--
-- Estrutura da tabela `gemeos`
--

DROP TABLE IF EXISTS `gemeos`;
CREATE TABLE IF NOT EXISTS `gemeos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(80) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `gemeos`
--

INSERT INTO `gemeos` (`id`, `descricao`) VALUES
(3, 'TREINO GEMEOS'),
(5, 'novo Teste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `gluteo`
--

DROP TABLE IF EXISTS `gluteo`;
CREATE TABLE IF NOT EXISTS `gluteo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(80) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `gluteo`
--

INSERT INTO `gluteo` (`id`, `descricao`) VALUES
(2, 'TREINO GLUTEOS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(60) NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `senha` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`id`, `nome`, `usuario`, `senha`) VALUES
(1, 'antonio', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Estrutura da tabela `mensalidade`
--

DROP TABLE IF EXISTS `mensalidade`;
CREATE TABLE IF NOT EXISTS `mensalidade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) NOT NULL,
  `dataInicio` varchar(10) DEFAULT NULL,
  `valor` float NOT NULL,
  `ano` varchar(4) NOT NULL,
  `janeriro` varchar(10) DEFAULT NULL,
  `fevereiro` varchar(10) DEFAULT NULL,
  `marco` varchar(10) DEFAULT NULL,
  `abril` varchar(10) DEFAULT NULL,
  `maio` varchar(10) DEFAULT NULL,
  `junho` varchar(10) DEFAULT NULL,
  `julho` varchar(10) DEFAULT NULL,
  `agosto` varchar(10) DEFAULT NULL,
  `setembro` varchar(10) DEFAULT NULL,
  `outubro` varchar(10) DEFAULT NULL,
  `novembro` varchar(10) DEFAULT NULL,
  `dezembro` varchar(10) DEFAULT NULL,
  `valorDebito` float DEFAULT NULL,
  `valorPago` float DEFAULT NULL,
  `diaPagamento` int(11) DEFAULT NULL,
  `dataTermino` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `mensalidade`
--

INSERT INTO `mensalidade` (`id`, `idCliente`, `dataInicio`, `valor`, `ano`, `janeriro`, `fevereiro`, `marco`, `abril`, `maio`, `junho`, `julho`, `agosto`, `setembro`, `outubro`, `novembro`, `dezembro`, `valorDebito`, `valorPago`, `diaPagamento`, `dataTermino`) VALUES
(6, 12, '22/09/2019', 50, '2019', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'pago', NULL, NULL, NULL, 0, 50, 10, '-'),
(7, 13, '12/10/2019', 50, '2019', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', NULL, NULL, 50, 0, 30, '-'),
(8, 14, '14/10/2019', 50, '2019', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', NULL, NULL, 50, 0, 30, '-'),
(9, 15, '15/10/2019', 50, '2019', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', NULL, NULL, 50, 0, 30, '-'),
(10, 16, '20/05/2019', 50, '2019', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', NULL, NULL, 0, 50, 23, '-'),
(11, 17, '25/10/2019', 50, '2019', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', NULL, NULL, NULL, -2, 50, 30, '-'),
(12, 18, '13/10/2019', 50, '2019', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', 'pago', NULL, NULL, 0, 50, 25, '-');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modeloabdome`
--

DROP TABLE IF EXISTS `modeloabdome`;
CREATE TABLE IF NOT EXISTS `modeloabdome` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idabdome` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(10) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modeloabdome`
--

INSERT INTO `modeloabdome` (`id`, `idabdome`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(6, 5, 'TESTE', 101, 1, 1, 1, 'NAO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modeloantebraco`
--

DROP TABLE IF EXISTS `modeloantebraco`;
CREATE TABLE IF NOT EXISTS `modeloantebraco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idAntebraco` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(10) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modeloantebraco`
--

INSERT INTO `modeloantebraco` (`id`, `idAntebraco`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(2, 2, '1', 1, 1, 1, 1, '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modelobiceps`
--

DROP TABLE IF EXISTS `modelobiceps`;
CREATE TABLE IF NOT EXISTS `modelobiceps` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idBiceps` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(10) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modelobiceps`
--

INSERT INTO `modelobiceps` (`id`, `idBiceps`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(2, 2, '1', 1, 1, 1, 1, '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modelocoxa`
--

DROP TABLE IF EXISTS `modelocoxa`;
CREATE TABLE IF NOT EXISTS `modelocoxa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idcoxa` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(10) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modelocoxa`
--

INSERT INTO `modelocoxa` (`id`, `idcoxa`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(2, 2, 'A', 1, 1, 1, 1, '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modelodeltoides`
--

DROP TABLE IF EXISTS `modelodeltoides`;
CREATE TABLE IF NOT EXISTS `modelodeltoides` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `iddeltoides` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(11) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modelodeltoides`
--

INSERT INTO `modelodeltoides` (`id`, `iddeltoides`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(2, 2, '1', 1, 1, 1, 1, '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modelodorsais`
--

DROP TABLE IF EXISTS `modelodorsais`;
CREATE TABLE IF NOT EXISTS `modelodorsais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `iddorsais` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(11) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modelodorsais`
--

INSERT INTO `modelodorsais` (`id`, `iddorsais`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(2, 2, '1', 1, 1, 1, 1, '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modeloficha`
--

DROP TABLE IF EXISTS `modeloficha`;
CREATE TABLE IF NOT EXISTS `modeloficha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idModeloAbdome` int(11) NOT NULL,
  `idModeloAntebraco` int(11) NOT NULL,
  `idModeloBiceps` int(11) NOT NULL,
  `idModeloCoxa` int(11) NOT NULL,
  `idModeloDeltoides` int(11) NOT NULL,
  `idModeloDorsais` int(11) NOT NULL,
  `idModeloGemeos` int(11) NOT NULL,
  `idModeloGruteo` int(11) NOT NULL,
  `idMoeloPeitorais` int(11) NOT NULL,
  `idModeloTriceps` int(11) NOT NULL,
  `idPerimetria` int(11) NOT NULL,
  `idRotinaTreino` int(11) NOT NULL,
  `idErgometria` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modeloficha`
--

INSERT INTO `modeloficha` (`id`, `idModeloAbdome`, `idModeloAntebraco`, `idModeloBiceps`, `idModeloCoxa`, `idModeloDeltoides`, `idModeloDorsais`, `idModeloGemeos`, `idModeloGruteo`, `idMoeloPeitorais`, `idModeloTriceps`, `idPerimetria`, `idRotinaTreino`, `idErgometria`) VALUES
(2, 6, 2, 2, 2, 2, 2, 3, 2, 3, 2, 1, 1, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `modelogemeos`
--

DROP TABLE IF EXISTS `modelogemeos`;
CREATE TABLE IF NOT EXISTS `modelogemeos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idgemeos` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(11) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modelogemeos`
--

INSERT INTO `modelogemeos` (`id`, `idgemeos`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(3, 3, '1', 1, 1, 1, 1, '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modelogluteo`
--

DROP TABLE IF EXISTS `modelogluteo`;
CREATE TABLE IF NOT EXISTS `modelogluteo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idgluteo` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(11) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modelogluteo`
--

INSERT INTO `modelogluteo` (`id`, `idgluteo`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(2, 2, '1', 1, 1, 1, 1, '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modelopeitorais`
--

DROP TABLE IF EXISTS `modelopeitorais`;
CREATE TABLE IF NOT EXISTS `modelopeitorais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idPeitorais` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(11) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modelopeitorais`
--

INSERT INTO `modelopeitorais` (`id`, `idPeitorais`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(3, 2, '1', 1, 1, 1, 1, '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modelotriceps`
--

DROP TABLE IF EXISTS `modelotriceps`;
CREATE TABLE IF NOT EXISTS `modelotriceps` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idtriceps` int(11) NOT NULL,
  `divt` varchar(60) NOT NULL,
  `serie` int(11) NOT NULL,
  `rept` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `intponto` int(11) NOT NULL,
  `cadencia` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modelotriceps`
--

INSERT INTO `modelotriceps` (`id`, `idtriceps`, `divt`, `serie`, `rept`, `carga`, `intponto`, `cadencia`) VALUES
(2, 2, '1', 1, 1, 1, 1, '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `peitorais`
--

DROP TABLE IF EXISTS `peitorais`;
CREATE TABLE IF NOT EXISTS `peitorais` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(80) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `peitorais`
--

INSERT INTO `peitorais` (`id`, `descricao`) VALUES
(2, 'TREINO PEITORAIS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `triceps`
--

DROP TABLE IF EXISTS `triceps`;
CREATE TABLE IF NOT EXISTS `triceps` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(80) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `triceps`
--

INSERT INTO `triceps` (`id`, `descricao`) VALUES
(2, 'TREINOS TRICEPS');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
