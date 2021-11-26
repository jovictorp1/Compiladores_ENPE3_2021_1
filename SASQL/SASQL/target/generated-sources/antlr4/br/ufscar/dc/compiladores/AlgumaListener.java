// Generated from br/ufscar/dc/compiladores/Alguma.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.alguma.sintatico.Arquivo;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#type_file}.
	 * @param ctx the parse tree
	 */
	void enterType_file(AlgumaParser.Type_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#type_file}.
	 * @param ctx the parse tree
	 */
	void exitType_file(AlgumaParser.Type_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AlgumaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AlgumaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(AlgumaParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(AlgumaParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AlgumaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AlgumaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd_create}.
	 * @param ctx the parse tree
	 */
	void enterCmd_create(AlgumaParser.Cmd_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd_create}.
	 * @param ctx the parse tree
	 */
	void exitCmd_create(AlgumaParser.Cmd_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#def_column}.
	 * @param ctx the parse tree
	 */
	void enterDef_column(AlgumaParser.Def_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#def_column}.
	 * @param ctx the parse tree
	 */
	void exitDef_column(AlgumaParser.Def_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(AlgumaParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(AlgumaParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd_select}.
	 * @param ctx the parse tree
	 */
	void enterCmd_select(AlgumaParser.Cmd_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd_select}.
	 * @param ctx the parse tree
	 */
	void exitCmd_select(AlgumaParser.Cmd_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd_where}.
	 * @param ctx the parse tree
	 */
	void enterCmd_where(AlgumaParser.Cmd_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd_where}.
	 * @param ctx the parse tree
	 */
	void exitCmd_where(AlgumaParser.Cmd_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd_insert}.
	 * @param ctx the parse tree
	 */
	void enterCmd_insert(AlgumaParser.Cmd_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd_insert}.
	 * @param ctx the parse tree
	 */
	void exitCmd_insert(AlgumaParser.Cmd_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd_drop}.
	 * @param ctx the parse tree
	 */
	void enterCmd_drop(AlgumaParser.Cmd_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd_drop}.
	 * @param ctx the parse tree
	 */
	void exitCmd_drop(AlgumaParser.Cmd_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd_delete}.
	 * @param ctx the parse tree
	 */
	void enterCmd_delete(AlgumaParser.Cmd_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd_delete}.
	 * @param ctx the parse tree
	 */
	void exitCmd_delete(AlgumaParser.Cmd_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#cmd_export}.
	 * @param ctx the parse tree
	 */
	void enterCmd_export(AlgumaParser.Cmd_exportContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#cmd_export}.
	 * @param ctx the parse tree
	 */
	void exitCmd_export(AlgumaParser.Cmd_exportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#val_input}.
	 * @param ctx the parse tree
	 */
	void enterVal_input(AlgumaParser.Val_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#val_input}.
	 * @param ctx the parse tree
	 */
	void exitVal_input(AlgumaParser.Val_inputContext ctx);
}