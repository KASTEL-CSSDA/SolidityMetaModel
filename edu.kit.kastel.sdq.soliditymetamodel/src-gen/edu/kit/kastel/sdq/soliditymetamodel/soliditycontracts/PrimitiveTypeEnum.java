/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getPrimitiveTypeEnum()
 * @model
 * @generated
 */
public enum PrimitiveTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Bool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOL_VALUE
	 * @generated
	 * @ordered
	 */
	BOOL(0, "bool", "bool"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(1, "int", "int"),

	/**
	 * The '<em><b>Uint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT_VALUE
	 * @generated
	 * @ordered
	 */
	UINT(2, "uint", "uint"),

	/**
	 * The '<em><b>Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS(3, "address", "address"),

	/**
	 * The '<em><b>Address payable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_PAYABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS_PAYABLE(4, "address_payable", "address_payable"),

	/**
	 * The '<em><b>Bytes1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES1_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES1(5, "bytes1", "bytes1"),

	/**
	 * The '<em><b>Bytes2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES2_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES2(6, "bytes2", "bytes2"),

	/**
	 * The '<em><b>Bytes3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES3_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES3(7, "bytes3", "bytes3"),

	/**
	 * The '<em><b>Bytes4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES4_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES4(8, "bytes4", "bytes4"),

	/**
	 * The '<em><b>Bytes5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES5_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES5(9, "bytes5", "bytes5"),

	/**
	 * The '<em><b>Bytes6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES6_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES6(10, "bytes6", "bytes6"),

	/**
	 * The '<em><b>Bytes7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES7_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES7(11, "bytes7", "bytes7"),

	/**
	 * The '<em><b>Bytes8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES8_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES8(12, "bytes8", "bytes8"),

	/**
	 * The '<em><b>Bytes9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES9_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES9(13, "bytes9", "bytes9"),

	/**
	 * The '<em><b>Bytes10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES10_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES10(14, "bytes10", "bytes10"),

	/**
	 * The '<em><b>Bytes11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES11_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES11(15, "bytes11", "bytes11"),

	/**
	 * The '<em><b>Bytes12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES12_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES12(16, "bytes12", "bytes12"),

	/**
	 * The '<em><b>Bytes13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES13_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES13(17, "bytes13", "bytes13"),

	/**
	 * The '<em><b>Bytes14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES14_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES14(18, "bytes14", "bytes14"),

	/**
	 * The '<em><b>Bytes15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES15_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES15(19, "bytes15", "bytes15"),

	/**
	 * The '<em><b>Bytes16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES16_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES16(20, "bytes16", "bytes16"),

	/**
	 * The '<em><b>Bytes17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES17_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES17(21, "bytes17", "bytes17"),

	/**
	 * The '<em><b>Bytes18</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES18_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES18(22, "bytes18", "bytes18"),

	/**
	 * The '<em><b>Bytes19</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES19_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES19(23, "bytes19", "bytes19"),

	/**
	 * The '<em><b>Bytes20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES20_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES20(24, "bytes20", "bytes20"),

	/**
	 * The '<em><b>Bytes21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES21_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES21(25, "bytes21", "bytes21"),

	/**
	 * The '<em><b>Bytes22</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES22_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES22(26, "bytes22", "bytes22"),

	/**
	 * The '<em><b>Bytes23</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES23_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES23(27, "bytes23", "bytes23"),

	/**
	 * The '<em><b>Bytes24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES24_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES24(28, "bytes24", "bytes24"),

	/**
	 * The '<em><b>Bytes25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES25_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES25(29, "bytes25", "bytes25"),

	/**
	 * The '<em><b>Bytes26</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES26_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES26(30, "bytes26", "bytes26"),

	/**
	 * The '<em><b>Bytes27</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES27_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES27(31, "bytes27", "bytes27"),

	/**
	 * The '<em><b>Bytes28</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES28_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES28(32, "bytes28", "bytes28"),

	/**
	 * The '<em><b>Bytes29</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES29_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES29(33, "bytes29", "bytes29"),

	/**
	 * The '<em><b>Bytes30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES30_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES30(34, "bytes30", "bytes30"),

	/**
	 * The '<em><b>Bytes31</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES31_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES31(35, "bytes31", "bytes31"),

	/**
	 * The '<em><b>Bytes32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES32_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES32(36, "bytes32", "bytes32"),

	/**
	 * The '<em><b>Int8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT8_VALUE
	 * @generated
	 * @ordered
	 */
	INT8(37, "int8", "int8"),

	/**
	 * The '<em><b>Int16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT16_VALUE
	 * @generated
	 * @ordered
	 */
	INT16(38, "int16", "int16"),

	/**
	 * The '<em><b>Int24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT24_VALUE
	 * @generated
	 * @ordered
	 */
	INT24(39, "int24", "int24"),

	/**
	 * The '<em><b>Int32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT32_VALUE
	 * @generated
	 * @ordered
	 */
	INT32(40, "int32", "int32"),

	/**
	 * The '<em><b>Int40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT40_VALUE
	 * @generated
	 * @ordered
	 */
	INT40(41, "int40", "int40"),

	/**
	 * The '<em><b>Int48</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT48_VALUE
	 * @generated
	 * @ordered
	 */
	INT48(42, "int48", "int48"),

	/**
	 * The '<em><b>Int56</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT56_VALUE
	 * @generated
	 * @ordered
	 */
	INT56(43, "int56", "int56"),

	/**
	 * The '<em><b>Int64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT64_VALUE
	 * @generated
	 * @ordered
	 */
	INT64(44, "int64", "int64"),

	/**
	 * The '<em><b>Int72</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT72_VALUE
	 * @generated
	 * @ordered
	 */
	INT72(45, "int72", "int72"),

	/**
	 * The '<em><b>Int80</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT80_VALUE
	 * @generated
	 * @ordered
	 */
	INT80(46, "int80", "int80"),

	/**
	 * The '<em><b>Int88</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT88_VALUE
	 * @generated
	 * @ordered
	 */
	INT88(47, "int88", "int88"),

	/**
	 * The '<em><b>Int96</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT96_VALUE
	 * @generated
	 * @ordered
	 */
	INT96(48, "int96", "int96"),

	/**
	 * The '<em><b>Int104</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT104_VALUE
	 * @generated
	 * @ordered
	 */
	INT104(49, "int104", "int104"),

	/**
	 * The '<em><b>Int112</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT112_VALUE
	 * @generated
	 * @ordered
	 */
	INT112(50, "int112", "int112"),

	/**
	 * The '<em><b>Int120</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT120_VALUE
	 * @generated
	 * @ordered
	 */
	INT120(51, "int120", "int120"),

	/**
	 * The '<em><b>Int128</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT128_VALUE
	 * @generated
	 * @ordered
	 */
	INT128(52, "int128", "int128"),

	/**
	 * The '<em><b>Int136</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT136_VALUE
	 * @generated
	 * @ordered
	 */
	INT136(53, "int136", "int136"),

	/**
	 * The '<em><b>Int144</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT144_VALUE
	 * @generated
	 * @ordered
	 */
	INT144(54, "int144", "int144"),

	/**
	 * The '<em><b>Int152</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT152_VALUE
	 * @generated
	 * @ordered
	 */
	INT152(55, "int152", "int152"),

	/**
	 * The '<em><b>Int160</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT160_VALUE
	 * @generated
	 * @ordered
	 */
	INT160(56, "int160", "int160"),

	/**
	 * The '<em><b>Int168</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT168_VALUE
	 * @generated
	 * @ordered
	 */
	INT168(57, "int168", "int168"),

	/**
	 * The '<em><b>Int176</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT176_VALUE
	 * @generated
	 * @ordered
	 */
	INT176(58, "int176", "int176"),

	/**
	 * The '<em><b>Int184</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT184_VALUE
	 * @generated
	 * @ordered
	 */
	INT184(59, "int184", "int184"),

	/**
	 * The '<em><b>Int192</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT192_VALUE
	 * @generated
	 * @ordered
	 */
	INT192(60, "int192", "int192"),

	/**
	 * The '<em><b>Int200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT200_VALUE
	 * @generated
	 * @ordered
	 */
	INT200(61, "int200", "int200"),

	/**
	 * The '<em><b>Int208</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT208_VALUE
	 * @generated
	 * @ordered
	 */
	INT208(62, "int208", "int208"),

	/**
	 * The '<em><b>Int216</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT216_VALUE
	 * @generated
	 * @ordered
	 */
	INT216(63, "int216", "int216"),

	/**
	 * The '<em><b>Int224</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT224_VALUE
	 * @generated
	 * @ordered
	 */
	INT224(64, "int224", "int224"),

	/**
	 * The '<em><b>Int232</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT232_VALUE
	 * @generated
	 * @ordered
	 */
	INT232(65, "int232", "int232"),

	/**
	 * The '<em><b>Int240</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT240_VALUE
	 * @generated
	 * @ordered
	 */
	INT240(66, "int240", "int240"),

	/**
	 * The '<em><b>Int248</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT248_VALUE
	 * @generated
	 * @ordered
	 */
	INT248(67, "int248", "int248"),

	/**
	 * The '<em><b>Int256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT256_VALUE
	 * @generated
	 * @ordered
	 */
	INT256(68, "int256", "int256"),

	/**
	 * The '<em><b>Uint8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT8_VALUE
	 * @generated
	 * @ordered
	 */
	UINT8(69, "uint8", "uint8"),

	/**
	 * The '<em><b>Uint16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT16_VALUE
	 * @generated
	 * @ordered
	 */
	UINT16(70, "uint16", "uint16"),

	/**
	 * The '<em><b>Uint24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT24_VALUE
	 * @generated
	 * @ordered
	 */
	UINT24(71, "uint24", "uint24"),

	/**
	 * The '<em><b>Uint32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT32_VALUE
	 * @generated
	 * @ordered
	 */
	UINT32(72, "uint32", "uint32"),

	/**
	 * The '<em><b>Uint40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT40_VALUE
	 * @generated
	 * @ordered
	 */
	UINT40(73, "uint40", "uint40"),

	/**
	 * The '<em><b>Uint48</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT48_VALUE
	 * @generated
	 * @ordered
	 */
	UINT48(74, "uint48", "uint48"),

	/**
	 * The '<em><b>Uint56</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT56_VALUE
	 * @generated
	 * @ordered
	 */
	UINT56(75, "uint56", "uint56"),

	/**
	 * The '<em><b>Uint64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT64_VALUE
	 * @generated
	 * @ordered
	 */
	UINT64(76, "uint64", "uint64"),

	/**
	 * The '<em><b>Uint72</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT72_VALUE
	 * @generated
	 * @ordered
	 */
	UINT72(77, "uint72", "uint72"),

	/**
	 * The '<em><b>Uint80</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT80_VALUE
	 * @generated
	 * @ordered
	 */
	UINT80(78, "uint80", "uint80"),

	/**
	 * The '<em><b>Uint88</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT88_VALUE
	 * @generated
	 * @ordered
	 */
	UINT88(79, "uint88", "uint88"),

	/**
	 * The '<em><b>Uint96</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT96_VALUE
	 * @generated
	 * @ordered
	 */
	UINT96(80, "uint96", "uint96"),

	/**
	 * The '<em><b>Uint104</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT104_VALUE
	 * @generated
	 * @ordered
	 */
	UINT104(81, "uint104", "uint104"),

	/**
	 * The '<em><b>Uint112</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT112_VALUE
	 * @generated
	 * @ordered
	 */
	UINT112(82, "uint112", "uint112"),

	/**
	 * The '<em><b>Uint120</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT120_VALUE
	 * @generated
	 * @ordered
	 */
	UINT120(83, "uint120", "uint120"),

	/**
	 * The '<em><b>Uint128</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT128_VALUE
	 * @generated
	 * @ordered
	 */
	UINT128(84, "uint128", "uint128"),

	/**
	 * The '<em><b>Uint136</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT136_VALUE
	 * @generated
	 * @ordered
	 */
	UINT136(85, "uint136", "uint136"),

	/**
	 * The '<em><b>Uint144</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT144_VALUE
	 * @generated
	 * @ordered
	 */
	UINT144(86, "uint144", "uint144"),

	/**
	 * The '<em><b>Uint152</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT152_VALUE
	 * @generated
	 * @ordered
	 */
	UINT152(87, "uint152", "uint152"),

	/**
	 * The '<em><b>Uint160</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT160_VALUE
	 * @generated
	 * @ordered
	 */
	UINT160(88, "uint160", "uint160"),

	/**
	 * The '<em><b>Uint168</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT168_VALUE
	 * @generated
	 * @ordered
	 */
	UINT168(89, "uint168", "uint168"),

	/**
	 * The '<em><b>Uint176</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT176_VALUE
	 * @generated
	 * @ordered
	 */
	UINT176(90, "uint176", "uint176"),

	/**
	 * The '<em><b>Uint184</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT184_VALUE
	 * @generated
	 * @ordered
	 */
	UINT184(91, "uint184", "uint184"),

	/**
	 * The '<em><b>Uint192</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT192_VALUE
	 * @generated
	 * @ordered
	 */
	UINT192(92, "uint192", "uint192"),

	/**
	 * The '<em><b>Uint200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT200_VALUE
	 * @generated
	 * @ordered
	 */
	UINT200(93, "uint200", "uint200"),

	/**
	 * The '<em><b>Uint208</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT208_VALUE
	 * @generated
	 * @ordered
	 */
	UINT208(94, "uint208", "uint208"),

	/**
	 * The '<em><b>Uint216</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT216_VALUE
	 * @generated
	 * @ordered
	 */
	UINT216(95, "uint216", "uint216"),

	/**
	 * The '<em><b>Uint224</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT224_VALUE
	 * @generated
	 * @ordered
	 */
	UINT224(96, "uint224", "uint224"),

	/**
	 * The '<em><b>Uint232</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT232_VALUE
	 * @generated
	 * @ordered
	 */
	UINT232(97, "uint232", "uint232"),

	/**
	 * The '<em><b>Uint240</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT240_VALUE
	 * @generated
	 * @ordered
	 */
	UINT240(98, "uint240", "uint240"),

	/**
	 * The '<em><b>Uint248</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT248_VALUE
	 * @generated
	 * @ordered
	 */
	UINT248(99, "uint248", "uint248"),

	/**
	 * The '<em><b>Uint256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT256_VALUE
	 * @generated
	 * @ordered
	 */
	UINT256(100, "uint256", "uint256");

	/**
	 * The '<em><b>Bool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOL
	 * @model name="bool"
	 * @generated
	 * @ordered
	 */
	public static final int BOOL_VALUE = 0;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 1;

	/**
	 * The '<em><b>Uint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT
	 * @model name="uint"
	 * @generated
	 * @ordered
	 */
	public static final int UINT_VALUE = 2;

	/**
	 * The '<em><b>Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS
	 * @model name="address"
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_VALUE = 3;

	/**
	 * The '<em><b>Address payable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_PAYABLE
	 * @model name="address_payable"
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_PAYABLE_VALUE = 4;

	/**
	 * The '<em><b>Bytes1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES1
	 * @model name="bytes1"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES1_VALUE = 5;

	/**
	 * The '<em><b>Bytes2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES2
	 * @model name="bytes2"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES2_VALUE = 6;

	/**
	 * The '<em><b>Bytes3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES3
	 * @model name="bytes3"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES3_VALUE = 7;

	/**
	 * The '<em><b>Bytes4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES4
	 * @model name="bytes4"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES4_VALUE = 8;

	/**
	 * The '<em><b>Bytes5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES5
	 * @model name="bytes5"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES5_VALUE = 9;

	/**
	 * The '<em><b>Bytes6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES6
	 * @model name="bytes6"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES6_VALUE = 10;

	/**
	 * The '<em><b>Bytes7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES7
	 * @model name="bytes7"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES7_VALUE = 11;

	/**
	 * The '<em><b>Bytes8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES8
	 * @model name="bytes8"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES8_VALUE = 12;

	/**
	 * The '<em><b>Bytes9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES9
	 * @model name="bytes9"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES9_VALUE = 13;

	/**
	 * The '<em><b>Bytes10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES10
	 * @model name="bytes10"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES10_VALUE = 14;

	/**
	 * The '<em><b>Bytes11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES11
	 * @model name="bytes11"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES11_VALUE = 15;

	/**
	 * The '<em><b>Bytes12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES12
	 * @model name="bytes12"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES12_VALUE = 16;

	/**
	 * The '<em><b>Bytes13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES13
	 * @model name="bytes13"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES13_VALUE = 17;

	/**
	 * The '<em><b>Bytes14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES14
	 * @model name="bytes14"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES14_VALUE = 18;

	/**
	 * The '<em><b>Bytes15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES15
	 * @model name="bytes15"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES15_VALUE = 19;

	/**
	 * The '<em><b>Bytes16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES16
	 * @model name="bytes16"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES16_VALUE = 20;

	/**
	 * The '<em><b>Bytes17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES17
	 * @model name="bytes17"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES17_VALUE = 21;

	/**
	 * The '<em><b>Bytes18</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES18
	 * @model name="bytes18"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES18_VALUE = 22;

	/**
	 * The '<em><b>Bytes19</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES19
	 * @model name="bytes19"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES19_VALUE = 23;

	/**
	 * The '<em><b>Bytes20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES20
	 * @model name="bytes20"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES20_VALUE = 24;

	/**
	 * The '<em><b>Bytes21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES21
	 * @model name="bytes21"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES21_VALUE = 25;

	/**
	 * The '<em><b>Bytes22</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES22
	 * @model name="bytes22"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES22_VALUE = 26;

	/**
	 * The '<em><b>Bytes23</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES23
	 * @model name="bytes23"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES23_VALUE = 27;

	/**
	 * The '<em><b>Bytes24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES24
	 * @model name="bytes24"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES24_VALUE = 28;

	/**
	 * The '<em><b>Bytes25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES25
	 * @model name="bytes25"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES25_VALUE = 29;

	/**
	 * The '<em><b>Bytes26</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES26
	 * @model name="bytes26"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES26_VALUE = 30;

	/**
	 * The '<em><b>Bytes27</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES27
	 * @model name="bytes27"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES27_VALUE = 31;

	/**
	 * The '<em><b>Bytes28</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES28
	 * @model name="bytes28"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES28_VALUE = 32;

	/**
	 * The '<em><b>Bytes29</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES29
	 * @model name="bytes29"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES29_VALUE = 33;

	/**
	 * The '<em><b>Bytes30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES30
	 * @model name="bytes30"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES30_VALUE = 34;

	/**
	 * The '<em><b>Bytes31</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES31
	 * @model name="bytes31"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES31_VALUE = 35;

	/**
	 * The '<em><b>Bytes32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES32
	 * @model name="bytes32"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES32_VALUE = 36;

	/**
	 * The '<em><b>Int8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT8
	 * @model name="int8"
	 * @generated
	 * @ordered
	 */
	public static final int INT8_VALUE = 37;

	/**
	 * The '<em><b>Int16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT16
	 * @model name="int16"
	 * @generated
	 * @ordered
	 */
	public static final int INT16_VALUE = 38;

	/**
	 * The '<em><b>Int24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT24
	 * @model name="int24"
	 * @generated
	 * @ordered
	 */
	public static final int INT24_VALUE = 39;

	/**
	 * The '<em><b>Int32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT32
	 * @model name="int32"
	 * @generated
	 * @ordered
	 */
	public static final int INT32_VALUE = 40;

	/**
	 * The '<em><b>Int40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT40
	 * @model name="int40"
	 * @generated
	 * @ordered
	 */
	public static final int INT40_VALUE = 41;

	/**
	 * The '<em><b>Int48</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT48
	 * @model name="int48"
	 * @generated
	 * @ordered
	 */
	public static final int INT48_VALUE = 42;

	/**
	 * The '<em><b>Int56</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT56
	 * @model name="int56"
	 * @generated
	 * @ordered
	 */
	public static final int INT56_VALUE = 43;

	/**
	 * The '<em><b>Int64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT64
	 * @model name="int64"
	 * @generated
	 * @ordered
	 */
	public static final int INT64_VALUE = 44;

	/**
	 * The '<em><b>Int72</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT72
	 * @model name="int72"
	 * @generated
	 * @ordered
	 */
	public static final int INT72_VALUE = 45;

	/**
	 * The '<em><b>Int80</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT80
	 * @model name="int80"
	 * @generated
	 * @ordered
	 */
	public static final int INT80_VALUE = 46;

	/**
	 * The '<em><b>Int88</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT88
	 * @model name="int88"
	 * @generated
	 * @ordered
	 */
	public static final int INT88_VALUE = 47;

	/**
	 * The '<em><b>Int96</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT96
	 * @model name="int96"
	 * @generated
	 * @ordered
	 */
	public static final int INT96_VALUE = 48;

	/**
	 * The '<em><b>Int104</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT104
	 * @model name="int104"
	 * @generated
	 * @ordered
	 */
	public static final int INT104_VALUE = 49;

	/**
	 * The '<em><b>Int112</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT112
	 * @model name="int112"
	 * @generated
	 * @ordered
	 */
	public static final int INT112_VALUE = 50;

	/**
	 * The '<em><b>Int120</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT120
	 * @model name="int120"
	 * @generated
	 * @ordered
	 */
	public static final int INT120_VALUE = 51;

	/**
	 * The '<em><b>Int128</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT128
	 * @model name="int128"
	 * @generated
	 * @ordered
	 */
	public static final int INT128_VALUE = 52;

	/**
	 * The '<em><b>Int136</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT136
	 * @model name="int136"
	 * @generated
	 * @ordered
	 */
	public static final int INT136_VALUE = 53;

	/**
	 * The '<em><b>Int144</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT144
	 * @model name="int144"
	 * @generated
	 * @ordered
	 */
	public static final int INT144_VALUE = 54;

	/**
	 * The '<em><b>Int152</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT152
	 * @model name="int152"
	 * @generated
	 * @ordered
	 */
	public static final int INT152_VALUE = 55;

	/**
	 * The '<em><b>Int160</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT160
	 * @model name="int160"
	 * @generated
	 * @ordered
	 */
	public static final int INT160_VALUE = 56;

	/**
	 * The '<em><b>Int168</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT168
	 * @model name="int168"
	 * @generated
	 * @ordered
	 */
	public static final int INT168_VALUE = 57;

	/**
	 * The '<em><b>Int176</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT176
	 * @model name="int176"
	 * @generated
	 * @ordered
	 */
	public static final int INT176_VALUE = 58;

	/**
	 * The '<em><b>Int184</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT184
	 * @model name="int184"
	 * @generated
	 * @ordered
	 */
	public static final int INT184_VALUE = 59;

	/**
	 * The '<em><b>Int192</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT192
	 * @model name="int192"
	 * @generated
	 * @ordered
	 */
	public static final int INT192_VALUE = 60;

	/**
	 * The '<em><b>Int200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT200
	 * @model name="int200"
	 * @generated
	 * @ordered
	 */
	public static final int INT200_VALUE = 61;

	/**
	 * The '<em><b>Int208</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT208
	 * @model name="int208"
	 * @generated
	 * @ordered
	 */
	public static final int INT208_VALUE = 62;

	/**
	 * The '<em><b>Int216</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT216
	 * @model name="int216"
	 * @generated
	 * @ordered
	 */
	public static final int INT216_VALUE = 63;

	/**
	 * The '<em><b>Int224</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT224
	 * @model name="int224"
	 * @generated
	 * @ordered
	 */
	public static final int INT224_VALUE = 64;

	/**
	 * The '<em><b>Int232</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT232
	 * @model name="int232"
	 * @generated
	 * @ordered
	 */
	public static final int INT232_VALUE = 65;

	/**
	 * The '<em><b>Int240</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT240
	 * @model name="int240"
	 * @generated
	 * @ordered
	 */
	public static final int INT240_VALUE = 66;

	/**
	 * The '<em><b>Int248</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT248
	 * @model name="int248"
	 * @generated
	 * @ordered
	 */
	public static final int INT248_VALUE = 67;

	/**
	 * The '<em><b>Int256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT256
	 * @model name="int256"
	 * @generated
	 * @ordered
	 */
	public static final int INT256_VALUE = 68;

	/**
	 * The '<em><b>Uint8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT8
	 * @model name="uint8"
	 * @generated
	 * @ordered
	 */
	public static final int UINT8_VALUE = 69;

	/**
	 * The '<em><b>Uint16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT16
	 * @model name="uint16"
	 * @generated
	 * @ordered
	 */
	public static final int UINT16_VALUE = 70;

	/**
	 * The '<em><b>Uint24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT24
	 * @model name="uint24"
	 * @generated
	 * @ordered
	 */
	public static final int UINT24_VALUE = 71;

	/**
	 * The '<em><b>Uint32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT32
	 * @model name="uint32"
	 * @generated
	 * @ordered
	 */
	public static final int UINT32_VALUE = 72;

	/**
	 * The '<em><b>Uint40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT40
	 * @model name="uint40"
	 * @generated
	 * @ordered
	 */
	public static final int UINT40_VALUE = 73;

	/**
	 * The '<em><b>Uint48</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT48
	 * @model name="uint48"
	 * @generated
	 * @ordered
	 */
	public static final int UINT48_VALUE = 74;

	/**
	 * The '<em><b>Uint56</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT56
	 * @model name="uint56"
	 * @generated
	 * @ordered
	 */
	public static final int UINT56_VALUE = 75;

	/**
	 * The '<em><b>Uint64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT64
	 * @model name="uint64"
	 * @generated
	 * @ordered
	 */
	public static final int UINT64_VALUE = 76;

	/**
	 * The '<em><b>Uint72</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT72
	 * @model name="uint72"
	 * @generated
	 * @ordered
	 */
	public static final int UINT72_VALUE = 77;

	/**
	 * The '<em><b>Uint80</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT80
	 * @model name="uint80"
	 * @generated
	 * @ordered
	 */
	public static final int UINT80_VALUE = 78;

	/**
	 * The '<em><b>Uint88</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT88
	 * @model name="uint88"
	 * @generated
	 * @ordered
	 */
	public static final int UINT88_VALUE = 79;

	/**
	 * The '<em><b>Uint96</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT96
	 * @model name="uint96"
	 * @generated
	 * @ordered
	 */
	public static final int UINT96_VALUE = 80;

	/**
	 * The '<em><b>Uint104</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT104
	 * @model name="uint104"
	 * @generated
	 * @ordered
	 */
	public static final int UINT104_VALUE = 81;

	/**
	 * The '<em><b>Uint112</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT112
	 * @model name="uint112"
	 * @generated
	 * @ordered
	 */
	public static final int UINT112_VALUE = 82;

	/**
	 * The '<em><b>Uint120</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT120
	 * @model name="uint120"
	 * @generated
	 * @ordered
	 */
	public static final int UINT120_VALUE = 83;

	/**
	 * The '<em><b>Uint128</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT128
	 * @model name="uint128"
	 * @generated
	 * @ordered
	 */
	public static final int UINT128_VALUE = 84;

	/**
	 * The '<em><b>Uint136</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT136
	 * @model name="uint136"
	 * @generated
	 * @ordered
	 */
	public static final int UINT136_VALUE = 85;

	/**
	 * The '<em><b>Uint144</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT144
	 * @model name="uint144"
	 * @generated
	 * @ordered
	 */
	public static final int UINT144_VALUE = 86;

	/**
	 * The '<em><b>Uint152</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT152
	 * @model name="uint152"
	 * @generated
	 * @ordered
	 */
	public static final int UINT152_VALUE = 87;

	/**
	 * The '<em><b>Uint160</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT160
	 * @model name="uint160"
	 * @generated
	 * @ordered
	 */
	public static final int UINT160_VALUE = 88;

	/**
	 * The '<em><b>Uint168</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT168
	 * @model name="uint168"
	 * @generated
	 * @ordered
	 */
	public static final int UINT168_VALUE = 89;

	/**
	 * The '<em><b>Uint176</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT176
	 * @model name="uint176"
	 * @generated
	 * @ordered
	 */
	public static final int UINT176_VALUE = 90;

	/**
	 * The '<em><b>Uint184</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT184
	 * @model name="uint184"
	 * @generated
	 * @ordered
	 */
	public static final int UINT184_VALUE = 91;

	/**
	 * The '<em><b>Uint192</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT192
	 * @model name="uint192"
	 * @generated
	 * @ordered
	 */
	public static final int UINT192_VALUE = 92;

	/**
	 * The '<em><b>Uint200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT200
	 * @model name="uint200"
	 * @generated
	 * @ordered
	 */
	public static final int UINT200_VALUE = 93;

	/**
	 * The '<em><b>Uint208</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT208
	 * @model name="uint208"
	 * @generated
	 * @ordered
	 */
	public static final int UINT208_VALUE = 94;

	/**
	 * The '<em><b>Uint216</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT216
	 * @model name="uint216"
	 * @generated
	 * @ordered
	 */
	public static final int UINT216_VALUE = 95;

	/**
	 * The '<em><b>Uint224</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT224
	 * @model name="uint224"
	 * @generated
	 * @ordered
	 */
	public static final int UINT224_VALUE = 96;

	/**
	 * The '<em><b>Uint232</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT232
	 * @model name="uint232"
	 * @generated
	 * @ordered
	 */
	public static final int UINT232_VALUE = 97;

	/**
	 * The '<em><b>Uint240</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT240
	 * @model name="uint240"
	 * @generated
	 * @ordered
	 */
	public static final int UINT240_VALUE = 98;

	/**
	 * The '<em><b>Uint248</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT248
	 * @model name="uint248"
	 * @generated
	 * @ordered
	 */
	public static final int UINT248_VALUE = 99;

	/**
	 * The '<em><b>Uint256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT256
	 * @model name="uint256"
	 * @generated
	 * @ordered
	 */
	public static final int UINT256_VALUE = 100;

	/**
	 * An array of all the '<em><b>Primitive Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveTypeEnum[] VALUES_ARRAY =
		new PrimitiveTypeEnum[] {
			BOOL,
			INT,
			UINT,
			ADDRESS,
			ADDRESS_PAYABLE,
			BYTES1,
			BYTES2,
			BYTES3,
			BYTES4,
			BYTES5,
			BYTES6,
			BYTES7,
			BYTES8,
			BYTES9,
			BYTES10,
			BYTES11,
			BYTES12,
			BYTES13,
			BYTES14,
			BYTES15,
			BYTES16,
			BYTES17,
			BYTES18,
			BYTES19,
			BYTES20,
			BYTES21,
			BYTES22,
			BYTES23,
			BYTES24,
			BYTES25,
			BYTES26,
			BYTES27,
			BYTES28,
			BYTES29,
			BYTES30,
			BYTES31,
			BYTES32,
			INT8,
			INT16,
			INT24,
			INT32,
			INT40,
			INT48,
			INT56,
			INT64,
			INT72,
			INT80,
			INT88,
			INT96,
			INT104,
			INT112,
			INT120,
			INT128,
			INT136,
			INT144,
			INT152,
			INT160,
			INT168,
			INT176,
			INT184,
			INT192,
			INT200,
			INT208,
			INT216,
			INT224,
			INT232,
			INT240,
			INT248,
			INT256,
			UINT8,
			UINT16,
			UINT24,
			UINT32,
			UINT40,
			UINT48,
			UINT56,
			UINT64,
			UINT72,
			UINT80,
			UINT88,
			UINT96,
			UINT104,
			UINT112,
			UINT120,
			UINT128,
			UINT136,
			UINT144,
			UINT152,
			UINT160,
			UINT168,
			UINT176,
			UINT184,
			UINT192,
			UINT200,
			UINT208,
			UINT216,
			UINT224,
			UINT232,
			UINT240,
			UINT248,
			UINT256,
		};

	/**
	 * A public read-only list of all the '<em><b>Primitive Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrimitiveTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveTypeEnum get(int value) {
		switch (value) {
			case BOOL_VALUE: return BOOL;
			case INT_VALUE: return INT;
			case UINT_VALUE: return UINT;
			case ADDRESS_VALUE: return ADDRESS;
			case ADDRESS_PAYABLE_VALUE: return ADDRESS_PAYABLE;
			case BYTES1_VALUE: return BYTES1;
			case BYTES2_VALUE: return BYTES2;
			case BYTES3_VALUE: return BYTES3;
			case BYTES4_VALUE: return BYTES4;
			case BYTES5_VALUE: return BYTES5;
			case BYTES6_VALUE: return BYTES6;
			case BYTES7_VALUE: return BYTES7;
			case BYTES8_VALUE: return BYTES8;
			case BYTES9_VALUE: return BYTES9;
			case BYTES10_VALUE: return BYTES10;
			case BYTES11_VALUE: return BYTES11;
			case BYTES12_VALUE: return BYTES12;
			case BYTES13_VALUE: return BYTES13;
			case BYTES14_VALUE: return BYTES14;
			case BYTES15_VALUE: return BYTES15;
			case BYTES16_VALUE: return BYTES16;
			case BYTES17_VALUE: return BYTES17;
			case BYTES18_VALUE: return BYTES18;
			case BYTES19_VALUE: return BYTES19;
			case BYTES20_VALUE: return BYTES20;
			case BYTES21_VALUE: return BYTES21;
			case BYTES22_VALUE: return BYTES22;
			case BYTES23_VALUE: return BYTES23;
			case BYTES24_VALUE: return BYTES24;
			case BYTES25_VALUE: return BYTES25;
			case BYTES26_VALUE: return BYTES26;
			case BYTES27_VALUE: return BYTES27;
			case BYTES28_VALUE: return BYTES28;
			case BYTES29_VALUE: return BYTES29;
			case BYTES30_VALUE: return BYTES30;
			case BYTES31_VALUE: return BYTES31;
			case BYTES32_VALUE: return BYTES32;
			case INT8_VALUE: return INT8;
			case INT16_VALUE: return INT16;
			case INT24_VALUE: return INT24;
			case INT32_VALUE: return INT32;
			case INT40_VALUE: return INT40;
			case INT48_VALUE: return INT48;
			case INT56_VALUE: return INT56;
			case INT64_VALUE: return INT64;
			case INT72_VALUE: return INT72;
			case INT80_VALUE: return INT80;
			case INT88_VALUE: return INT88;
			case INT96_VALUE: return INT96;
			case INT104_VALUE: return INT104;
			case INT112_VALUE: return INT112;
			case INT120_VALUE: return INT120;
			case INT128_VALUE: return INT128;
			case INT136_VALUE: return INT136;
			case INT144_VALUE: return INT144;
			case INT152_VALUE: return INT152;
			case INT160_VALUE: return INT160;
			case INT168_VALUE: return INT168;
			case INT176_VALUE: return INT176;
			case INT184_VALUE: return INT184;
			case INT192_VALUE: return INT192;
			case INT200_VALUE: return INT200;
			case INT208_VALUE: return INT208;
			case INT216_VALUE: return INT216;
			case INT224_VALUE: return INT224;
			case INT232_VALUE: return INT232;
			case INT240_VALUE: return INT240;
			case INT248_VALUE: return INT248;
			case INT256_VALUE: return INT256;
			case UINT8_VALUE: return UINT8;
			case UINT16_VALUE: return UINT16;
			case UINT24_VALUE: return UINT24;
			case UINT32_VALUE: return UINT32;
			case UINT40_VALUE: return UINT40;
			case UINT48_VALUE: return UINT48;
			case UINT56_VALUE: return UINT56;
			case UINT64_VALUE: return UINT64;
			case UINT72_VALUE: return UINT72;
			case UINT80_VALUE: return UINT80;
			case UINT88_VALUE: return UINT88;
			case UINT96_VALUE: return UINT96;
			case UINT104_VALUE: return UINT104;
			case UINT112_VALUE: return UINT112;
			case UINT120_VALUE: return UINT120;
			case UINT128_VALUE: return UINT128;
			case UINT136_VALUE: return UINT136;
			case UINT144_VALUE: return UINT144;
			case UINT152_VALUE: return UINT152;
			case UINT160_VALUE: return UINT160;
			case UINT168_VALUE: return UINT168;
			case UINT176_VALUE: return UINT176;
			case UINT184_VALUE: return UINT184;
			case UINT192_VALUE: return UINT192;
			case UINT200_VALUE: return UINT200;
			case UINT208_VALUE: return UINT208;
			case UINT216_VALUE: return UINT216;
			case UINT224_VALUE: return UINT224;
			case UINT232_VALUE: return UINT232;
			case UINT240_VALUE: return UINT240;
			case UINT248_VALUE: return UINT248;
			case UINT256_VALUE: return UINT256;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PrimitiveTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PrimitiveTypeEnum
