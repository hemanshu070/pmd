/* Generated By:JJTree: Do not edit this line. ASTInput.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

import net.sourceforge.pmd.lang.ast.RootNode;

public
class ASTInput extends SimpleNode implements RootNode {
  public ASTInput(int id) {
    super(id);
  }

  public ASTInput(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b66a3e6c4f76fde9e060f2c8173d0d01 (do not edit this line) */
