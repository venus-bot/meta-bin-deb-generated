PACKAGES = "gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
PROVIDES = "gcc-4.9-base libatomic1 libgcc1 libgomp1 libstdc++6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/gcc-4.9-base_4.9.2-10_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libatomic1_4.9.2-10_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libgcc1_4.9.2-10_armhf.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libgomp1_4.9.2-10_armhf.deb;unpack=0;name=deb3\
	http://archive.raspbian.org/raspbian/pool/main/g/gcc-4.9/libstdc++6_4.9.2-10_armhf.deb;unpack=0;name=deb4\
"
DEBFILENAME_gcc-4.9-base = "gcc-4.9-base_4.9.2-10_armhf.deb"
SRC_URI[deb0.sha256sum] = "0b4c8479e71c51c39b247e01f2aff0d8a9c17d6351d0f9bec865f8933e941126"
SRC_URI[deb0.md5sum] = "ee2fa5deb05b375f504deaae4b17402d"
DEBFILENAME_libatomic1 = "libatomic1_4.9.2-10_armhf.deb"
SRC_URI[deb1.sha256sum] = "026eef12674da81e344a102788f60d8df802563b440b0815b59e125d5a6df102"
SRC_URI[deb1.md5sum] = "1f48d0d26f3f8460ebfad2ad8fa11c2f"
DEBFILENAME_libgcc1 = "libgcc1_4.9.2-10_armhf.deb"
SRC_URI[deb2.sha256sum] = "4b1da51ed51596fdd1eba14af420a8e7bd6e32183c2bbd8bfb9cb0c71b020e56"
SRC_URI[deb2.md5sum] = "4fc60fc58be8f4a4b738daddecdd12ac"
DEBFILENAME_libgomp1 = "libgomp1_4.9.2-10_armhf.deb"
SRC_URI[deb3.sha256sum] = "94be3334d3020fb83ad854ae5e90d3cf2913aff0bdcab144e316c3c77c8901eb"
SRC_URI[deb3.md5sum] = "f495e0733afee950b743775711e542a3"
DEBFILENAME_libstdc++6 = "libstdc++6_4.9.2-10_armhf.deb"
SRC_URI[deb4.sha256sum] = "84777bed8badf8a065601e236a9f64e64be6f71f95cab00ff96538b9cc48eca5"
SRC_URI[deb4.md5sum] = "7459b78318d54c5987d658b8c553d1c4"

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
	./usr/share/doc/gcc-4.9-base/TODO.Debian \
	./usr/share/doc/gcc-4.9-base/copyright \
	./usr/share/doc/gcc-4.9-base/README.Debian.armhf.gz \
	./usr/lib/gcc/arm-linux-gnueabihf/4.9.2 \
	./usr/share/doc/gcc-4.9-base/changelog.Debian.gz\
"
FILES_libatomic1 = " \
	./usr/share/doc/libatomic1 \
	./usr/lib/arm-linux-gnueabihf/libatomic.so.1.1.0 \
	./usr/lib/arm-linux-gnueabihf/libatomic.so.1\
"
FILES_libgcc1 = " \
	./lib/arm-linux-gnueabihf/libgcc_s.so.1 \
	./usr/share/lintian/overrides/libgcc1 \
	./usr/share/doc/libgcc1\
"
FILES_libgomp1 = " \
	./usr/share/doc/libgomp1 \
	./usr/lib/arm-linux-gnueabihf/libgomp.so.1 \
	./usr/lib/arm-linux-gnueabihf/libgomp.so.1.0.0\
"
FILES_libstdc++6 = " \
	./usr/share/gdb/auto-load/usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20-gdb.py \
	./usr/share/gcc-4.9/python/libstdcxx/v6/__init__.py \
	./usr/share/gcc-4.9/python/libstdcxx/__init__.py \
	./usr/share/gcc-4.9/python/libstdcxx/v6/printers.py \
	./usr/lib/arm-linux-gnueabihf/libstdc++.so.6.0.20 \
	./usr/share/doc/libstdc++6 \
	./usr/lib/arm-linux-gnueabihf/libstdc++.so.6\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
