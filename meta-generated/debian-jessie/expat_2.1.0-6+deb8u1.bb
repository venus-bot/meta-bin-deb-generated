PACKAGES = "libexpat1"
PROVIDES = "libexpat1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/e/expat/libexpat1_2.1.0-6+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libexpat1 = "libexpat1_2.1.0-6+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8b78018c546b4c2c3caa21fee6f6def1c51b645e59e10f56800ed8080b940c9f"
SRC_URI[deb0.md5sum] = "396f3d39ae37a750d1f63fc74320ab11"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libexpat1 = " \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so.1 \
	./usr/share/doc/libexpat1/copyright \
	./usr/share/doc/libexpat1/changelog.gz \
	./lib/arm-linux-gnueabihf/libexpat.so.1.6.0 \
	./usr/share/doc/libexpat1/changelog.Debian.gz \
	./lib/arm-linux-gnueabihf/libexpat.so.1 \
	./usr/lib/arm-linux-gnueabihf/libexpatw.so.1.6.0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
