PACKAGES = "${PN} gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
PROVIDES = "gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/gcc-4.9-base_4.9.2-10_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/libatomic1_4.9.2-10_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/libgcc1_4.9.2-10_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/libgomp1_4.9.2-10_armhf.deb;unpack=0;name=deb3\
	http://ftp.de.debian.org/debian/pool/main/g/gcc-4.9/libstdc++6_4.9.2-10_armhf.deb;unpack=0;name=deb4\
"
DEBFILENAME_gcc-4.9-base = "gcc-4.9-base_4.9.2-10_armhf.deb"
SRC_URI[deb0.sha256sum] = "c91b330907b6fb62b080de43df1a519a41f13b8cf253896a3b5fdcff7788990b"
SRC_URI[deb0.md5sum] = "d1722bf1cfacce8e5ef4b92b2a096428"
DEBFILENAME_libatomic1 = "libatomic1_4.9.2-10_armhf.deb"
SRC_URI[deb1.sha256sum] = "15fe203eafc1b45d09e0450612f9efed75d581c578eef822d9c155d52c524e69"
SRC_URI[deb1.md5sum] = "03c8d6df76f7996b943bf350e733fd74"
DEBFILENAME_libgcc1 = "libgcc1_4.9.2-10_armhf.deb"
SRC_URI[deb2.sha256sum] = "285374137e3d739e65dd94df0278fd9a1bd101197c3c141193252d868c02ac85"
SRC_URI[deb2.md5sum] = "6e1941a547478e95ddf50ec6d093999a"
DEBFILENAME_libgomp1 = "libgomp1_4.9.2-10_armhf.deb"
SRC_URI[deb3.sha256sum] = "a6ead9bce12f4664f4b46350ca31bd6097a46426d87667043f91d710fcd40895"
SRC_URI[deb3.md5sum] = "75ebad2e25aa3c5dc732a804895e843d"
DEBFILENAME_libstdc++6 = "libstdc++6_4.9.2-10_armhf.deb"
SRC_URI[deb4.sha256sum] = "d6662adef32967ca4d7f22568b3f239e428f48398c2c4e202cbd46ddc4033767"
SRC_URI[deb4.md5sum] = "b1f9700c58bae72aa0219cd2727ac4da"

RDEPENDS_libatomic1 = "gcc-4.9-base (= 4.9.2-10) libc6 (>= 2.4)"
RDEPENDS_libgcc1 = "gcc-4.9-base (= 4.9.2-10) libc6 (>= 2.4)"
RDEPENDS_libgomp1 = "gcc-4.9-base (= 4.9.2-10) libc6 (>= 2.17)"
RDEPENDS_libstdc++6 = "gcc-4.9-base (= 4.9.2-10) libc6 (>= 2.18) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_gcc-4.9-base = " \
    ./usr/lib/gcc/arm-linux-gnueabihf/4.9.2 \
    ./usr/share/doc/gcc-4.9-base/README.Debian.armhf.gz \
    ./usr/share/doc/gcc-4.9-base/TODO.Debian \
    ./usr/share/doc/gcc-4.9-base/changelog.Debian.gz \
    ./usr/share/doc/gcc-4.9-base/copyright\
"
FILES_libatomic1 = " \
    ./usr/lib/arm-linux-gnueabihf/libatomic.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libatomic.so.1.1.0 \
    ./usr/share/doc/libatomic1\
"
FILES_libgcc1 = " \
    ./lib/arm-linux-gnueabihf/libgcc_s.so.1 \
    ./usr/share/doc/libgcc1 \
    ./usr/share/lintian/overrides/libgcc1\
"
FILES_libgomp1 = " \
    ./usr/lib/arm-linux-gnueabihf/libgomp.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libgomp.so.1.0.0 \
    ./usr/share/doc/libgomp1\
"
FILES_libstdc++6 = " \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20 \
    ./usr/share/doc/libstdc++6 \
    ./usr/share/gcc-4.9/python/libstdcxx/__init__.py \
    ./usr/share/gcc-4.9/python/libstdcxx/v6/__init__.py \
    ./usr/share/gcc-4.9/python/libstdcxx/v6/printers.py \
    ./usr/share/gdb/auto-load/usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20-gdb.py\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
