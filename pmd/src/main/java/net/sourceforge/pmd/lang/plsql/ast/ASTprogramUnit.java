/* Generated By:JJTree: Do not edit this line. ASTProgramUnit.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTProgramUnit extends SimpleNode {
  public ASTProgramUnit(int id) {
    super(id);
  }

  public ASTProgramUnit(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=13a333959a49d61fb9c144e60232a83c (do not edit this line) */
