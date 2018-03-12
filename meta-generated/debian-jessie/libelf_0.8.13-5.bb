PACKAGES = "${PN} libelfg0"
PROVIDES = "libelfg0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libe/libelf/libelfg0_0.8.13-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libelfg0 = "libelfg0_0.8.13-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "d2f7d81228179cbe661599aae5ab893da1bd221c343cd3afa5000159fe8867ee"
SRC_URI[deb0.md5sum] = "1c1b67ced7d6f3d386ed72b6342c3d59"

RDEPENDS_${PN}g0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libelfg0 = " \
    ./usr/share/locale/de/LC_MESSAGES/libelf.mo \
    ./usr/share/doc/libelfg0/changelog.Debian.gz \
    ./usr/lib/arm-linux-gnueabihf/libelf.so.0.8.13 \
    ./usr/lib/arm-linux-gnueabihf/libelf.so.0 \
    ./usr/share/doc/libelfg0/changelog.gz \
    ./usr/share/doc/libelfg0/README.gz \
    ./usr/share/doc/libelfg0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
