PACKAGES = "libffi6"
PROVIDES = "libffi6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libf/libffi/libffi6_3.1-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libffi6 = "libffi6_3.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "f590a773e78641e5d897e4c5e3646137db6bcee6fe9cc1daaa72ebb6293d27ff"
SRC_URI[deb0.md5sum] = "01f0a43f3145c11ff494180a830a87ff"

RDEPENDS_${PN}6 = "libc6 (>= 2.4) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libffi6 = " \
	./usr/lib/arm-linux-gnueabihf/libffi.so.6 \
	./usr/share/doc/libffi6/changelog.Debian.gz \
	./usr/share/doc/libffi6/copyright \
	./usr/lib/arm-linux-gnueabihf/libffi.so.6.0.2\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
