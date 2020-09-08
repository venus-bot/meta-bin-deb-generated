PACKAGES = "${PN} libxdmcp-dev libxdmcp6"
PROVIDES = "libxdmcp-dev libxdmcp6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxdmcp/libxdmcp-dev_1.1.2-3_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libx/libxdmcp/libxdmcp6_1.1.2-3_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxdmcp-dev = "libxdmcp-dev_1.1.2-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "8b4f46daf5dcf91180444812be90174ae10001dbe0a8fbdceaba73a12469aa62"
SRC_URI[deb0.md5sum] = "1ff52d1a6633731c3ecdb4986c20c73d"
DEBFILENAME_libxdmcp6 = "libxdmcp6_1.1.2-3_armhf.deb"
SRC_URI[deb1.sha256sum] = "ad47858edc6469f8288a13238ee53c12f5745636bf0dc12fce798db2718602bd"
SRC_URI[deb1.md5sum] = "08c5c7e69fbac4cac785e8c40c2eb426"

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
