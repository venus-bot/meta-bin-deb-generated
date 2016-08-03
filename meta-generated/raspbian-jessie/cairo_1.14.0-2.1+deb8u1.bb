PACKAGES = "libcairo-gobject2 libcairo2"
PROVIDES = "libcairo-gobject2 libcairo2"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo-gobject2_1.14.0-2.1+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/c/cairo/libcairo2_1.14.0-2.1+deb8u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libcairo-gobject2 = "libcairo-gobject2_1.14.0-2.1+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "fffee22fd1959dedcd6ddc8ce3df0ee3e18d80ebae06b54faf7eda93194cde4d"
SRC_URI[deb0.md5sum] = "7228d8eed8fed4f31b83c0300bcec1d7"
DEBFILENAME_libcairo2 = "libcairo2_1.14.0-2.1+deb8u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "24619dbe2e83f6753b37a679df495315840e8f567b9bd9840cde98e0caf26a91"
SRC_URI[deb1.md5sum] = "4028d44c3e46f9d590d8296b411d0158"

RDEPENDS_lib${PN}-gobject2 = "libc6 (>= 2.4) libcairo2 (>= 1.10.0) libglib2.0-0 (>= 2.14.0)"
RDEPENDS_lib${PN}2 = "libc6 (>= 2.11) libfontconfig1 (>= 2.11) libfreetype6 (>= 2.3.5) libpixman-1-0 (>= 0.30.0) libpng12-0 (>= 1.2.13-4) libx11-6 libxcb-render0 libxcb-shm0 libxcb1 (>= 1.6) libxext6 libxrender1 zlib1g (>= 1:1.1.4)"
DEPENDS = "libglib2.0-0 libx11-6 zlib1g libxcb1 libpng12-0 libxrender1 libpixman-1-0 libxext6 libfreetype6 libxcb-render0 libc6 libxcb-shm0 libfontconfig1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libcairo-gobject2 = " \
	./usr/share/doc/libcairo-gobject2/changelog.gz \
	./usr/share/doc/libcairo-gobject2/copyright \
	./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2 \
	./usr/lib/arm-linux-gnueabihf/libcairo-gobject.so.2.11400.0 \
	./usr/share/doc/libcairo-gobject2/NEWS.gz \
	./usr/share/doc/libcairo-gobject2/README.gz \
	./usr/share/doc/libcairo-gobject2/AUTHORS.gz \
	./usr/share/doc/libcairo-gobject2/changelog.Debian.gz\
"
FILES_libcairo2 = " \
	./usr/share/doc/libcairo2/copyright \
	./usr/share/doc/libcairo2/changelog.gz \
	./usr/share/doc/libcairo2/README.gz \
	./usr/lib/arm-linux-gnueabihf/libcairo.so.2 \
	./usr/lib/arm-linux-gnueabihf/libcairo.so.2.11400.0 \
	./usr/share/doc/libcairo2/changelog.Debian.gz \
	./usr/share/doc/libcairo2/AUTHORS.gz \
	./usr/share/doc/libcairo2/NEWS.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
