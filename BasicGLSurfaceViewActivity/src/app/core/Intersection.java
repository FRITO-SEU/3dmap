package app.core;
public class Intersection {
	/**�߽���ߵ��غϲ������ཻ�����*/
	public static boolean AABB2DwithAABB2D(AABB2D a,AABB2D b) {
		return (Math.abs(a.x-b.x)-a.halfx-a.halfx)<0&&
				(Math.abs(a.y-b.y)-a.halfy-a.halfy)<0;
	}
}
