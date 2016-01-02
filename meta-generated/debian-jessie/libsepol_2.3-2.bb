PACKAGES = "libsepol1"
PROVIDES = "libsepol1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libs/libsepol/libsepol1_2.3-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsepol1 = "libsepol1_2.3-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "4e90a7bf0f39938c005c6ebd7fc087d7024c6b765e5065e99564004cccf1905a"
SRC_URI[deb0.md5sum] = "e898d28619724af1a903e9963f65c6e8"

RDEPENDS_${PN}1 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsepol1 = " \
	./usr/share/doc/libsepol1/changelog.Debian.gz \
	./usr/share/doc/libsepol1/copyright \
	./usr/share/doc/libsepol1/changelog.gz \
	./lib/arm-linux-gnueabihf/libsepol.so.1\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
