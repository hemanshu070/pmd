/* Generated By:JJTree: Do not edit this line. ASTPragmaClause.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTPragmaClause extends SimpleNode {
  public ASTPragmaClause(int id) {
    super(id);
  }

  public ASTPragmaClause(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9b69d228dd1887dae2003f3ce28ec2ff (do not edit this line) */
