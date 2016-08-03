PACKAGES = "libtasn1-3"
PROVIDES = "libtasn1-3"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libt/libtasn1-3/libtasn1-3_2.13-2+deb7u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtasn1-3 = "libtasn1-3_2.13-2+deb7u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "bbf61b5e72aa7d2428c11f668aefadc073b457cdf6b0757555c81a5a04e6ee96"
SRC_URI[deb0.md5sum] = "f9da8a4cfd9217a3fe74f660a79e5812"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/libtasn1-3/copyright \
	./usr/share/doc/libtasn1-3/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/libtasn1.so.3 \
	./usr/share/doc/libtasn1-3/AUTHORS \
	./usr/share/doc/libtasn1-3/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libtasn1.so.3.1.16 \
	./usr/share/doc/libtasn1-3/README \
	./usr/share/doc/libtasn1-3/changelog.gz \
	./usr/share/doc/libtasn1-3/THANKS\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
