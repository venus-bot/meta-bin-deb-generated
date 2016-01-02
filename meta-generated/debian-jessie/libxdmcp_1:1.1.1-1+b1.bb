PACKAGES = "libxdmcp-dev libxdmcp6"
PROVIDES = "libxdmcp-dev libxdmcp6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxdmcp/libxdmcp-dev_1.1.1-1+b1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libx/libxdmcp/libxdmcp6_1.1.1-1+b1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxdmcp-dev = "libxdmcp-dev_1.1.1-1+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "da97fb1ec76280552796e00d4fe9f46b80c197bbe8a836211c40bb81924b876c"
SRC_URI[deb0.md5sum] = "28eb54c1b440cb9a4d86798815d96ca6"
DEBFILENAME_libxdmcp6 = "libxdmcp6_1.1.1-1+b1_armhf.deb"
SRC_URI[deb1.sha256sum] = "c6b3a0af35740048006f4f61f3b0ee3463164f0a6a792e9273d6f2b9a3905fef"
SRC_URI[deb1.md5sum] = "406364969dc6bd3d330d295356b5c98d"

RDEPENDS_${PN}-dev = "libxdmcp6 (= 1:1.1.1-1+b1) x11proto-core-dev"
RDEPENDS_${PN}6 = "libc6 (>= 2.4)"
DEPENDS = "x11proto-core-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/xdmcp.pc \
	./usr/share/doc/libxdmcp-dev/changelog.Debian.armhf.gz \
	./usr/share/doc/libxdmcp-dev/copyright \
	./usr/share/doc/libxdmcp-dev/changelog.Debian.gz \
	./usr/include/X11/Xdmcp.h \
	./usr/lib/arm-linux-gnueabihf/libXdmcp.so \
	./usr/share/doc/libxdmcp-dev/changelog.gz \
	./usr/share/doc/libxdmcp-dev/xdmcp.txt.gz \
	./usr/lib/arm-linux-gnueabihf/libXdmcp.a\
"
FILES_libxdmcp6 = " \
	./usr/lib/arm-linux-gnueabihf/libXdmcp.so.6 \
	./usr/lib/arm-linux-gnueabihf/libXdmcp.so.6.0.0 \
	./usr/share/doc/libxdmcp6/changelog.gz \
	./usr/share/doc/libxdmcp6/changelog.Debian.gz \
	./usr/share/doc/libxdmcp6/copyright \
	./usr/share/doc/libxdmcp6/changelog.Debian.armhf.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
