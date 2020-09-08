PACKAGES = "${PN} libxdmcp-dev libxdmcp6"
PROVIDES = "libxdmcp-dev libxdmcp6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxdmcp/libxdmcp-dev_1.1.2-3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxdmcp/libxdmcp6_1.1.2-3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxdmcp-dev = "libxdmcp-dev_1.1.2-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "0b6ec5b04e8118c3d664e7dd7b7efe884a7c116776aa98b89bf6ce648996ea11"
SRC_URI[deb0.md5sum] = "6c3591a2b5ab6cea073ff547fb92e0d7"
DEBFILENAME_libxdmcp6 = "libxdmcp6_1.1.2-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "c871d428ca79b15b31967a8e2f19507f06c4af10bcc29429a903a175634af6e4"
SRC_URI[deb1.md5sum] = "78de7eceefb572d0c057bd0f75b4b30e"

RDEPENDS_${PN}-dev = "libxdmcp6 (= 1:1.1.2-3) x11proto-core-dev"
RDEPENDS_${PN}6 = "libbsd0 (>= 0.2.0) libc6 (>= 2.4)"
DEPENDS = "libbsd0 libc6 x11proto-core-dev"


inherit deb_group

FILES_${PN}-dev = " \
    ./usr/include/X11/Xdmcp.h \
    ./usr/lib/arm-linux-gnueabihf/libXdmcp.a \
    ./usr/lib/arm-linux-gnueabihf/libXdmcp.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/xdmcp.pc \
    ./usr/share/doc/libxdmcp-dev/changelog.Debian.gz \
    ./usr/share/doc/libxdmcp-dev/changelog.gz \
    ./usr/share/doc/libxdmcp-dev/copyright \
    ./usr/share/doc/libxdmcp-dev/xdmcp.txt.gz\
"
FILES_libxdmcp6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXdmcp.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXdmcp.so.6.0.0 \
    ./usr/share/doc/libxdmcp6/changelog.Debian.gz \
    ./usr/share/doc/libxdmcp6/changelog.gz \
    ./usr/share/doc/libxdmcp6/copyright\
"
