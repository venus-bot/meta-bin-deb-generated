PACKAGES = "${PN} libpython3-stdlib python3 python3-minimal"
PROVIDES = "libpython3-stdlib python3 python3-minimal"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/p/python3-defaults/libpython3-stdlib_3.7.3-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/p/python3-defaults/python3_3.7.3-1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/p/python3-defaults/python3-minimal_3.7.3-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_libpython3-stdlib = "libpython3-stdlib_3.7.3-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "9e9d450c4563f8401ac61572ce8ab64224c50c70fb2167462ae91b65ae5be5c4"
SRC_URI[deb0.md5sum] = "cbb558443c477ba7b76982b39a9120cc"
DEBFILENAME_python3 = "python3_3.7.3-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "ea96636f2c722bbf9d0cbc3aa3d884ca043fa8196e3e84a490ae867d3750efa4"
SRC_URI[deb1.md5sum] = "4029342fc44e4a1f97e7c4dcf8b2fd9d"
DEBFILENAME_python3-minimal = "python3-minimal_3.7.3-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "8766848b4fec22c1e89a778f29cd5fb6e247c57442a0db65623a85d8be5d25df"
SRC_URI[deb2.md5sum] = "1b8efd55f4fd028d493b77cedabdea36"

RDEPENDS_lib${PN}-stdlib = "libpython3.7-stdlib (>= 3.7.3-1~)"
RDEPENDS_${PN} = "libpython3-stdlib (= 3.7.3-1) python3-minimal (= 3.7.3-1) python3.7 (>= 3.7.3-1~)"
RDEPENDS_${PN}-minimal = "dpkg (>= 1.13.20) python3.7-minimal (>= 3.7.3-1~)"
DEPENDS = "dpkg libpython3.7-stdlib python3.7 python3.7-minimal"


inherit deb_group

FILES_libpython3-stdlib = " \
    ./usr/share/doc/libpython3-stdlib/README.Debian \
    ./usr/share/doc/libpython3-stdlib/changelog.Debian.gz \
    ./usr/share/doc/libpython3-stdlib/copyright\
"
FILES_${PN} = " \
    ./usr/bin/pdb3 \
    ./usr/bin/pydoc3 \
    ./usr/bin/pygettext3 \
    ./usr/lib/valgrind/python3.supp \
    ./usr/share/doc/python3.7/python-policy.dbk.gz \
    ./usr/share/doc/python3.7/python-policy.html \
    ./usr/share/doc/python3.7/python-policy.txt.gz \
    ./usr/share/doc/python3/README.Debian \
    ./usr/share/doc/python3/changelog.Debian.gz \
    ./usr/share/doc/python3/copyright \
    ./usr/share/doc/python3/python-policy.dbk.gz \
    ./usr/share/doc/python3/python-policy.html/build_dependencies.html \
    ./usr/share/doc/python3/python-policy.html/embed.html \
    ./usr/share/doc/python3/python-policy.html/index.html \
    ./usr/share/doc/python3/python-policy.html/module_packages.html \
    ./usr/share/doc/python3/python-policy.html/other.html \
    ./usr/share/doc/python3/python-policy.html/packaging_tools.html \
    ./usr/share/doc/python3/python-policy.html/programs.html \
    ./usr/share/doc/python3/python-policy.html/python.html \
    ./usr/share/doc/python3/python-policy.html/python3.html \
    ./usr/share/doc/python3/python-policy.html/upgrade.html \
    ./usr/share/doc/python3/python-policy.txt.gz \
    ./usr/share/lintian/overrides/python3 \
    ./usr/share/man/man1/pdb3.1.gz \
    ./usr/share/man/man1/pydoc3.1.gz \
    ./usr/share/man/man1/pygettext3.1.gz \
    ./usr/share/pixmaps/python3.xpm \
    ./usr/share/python3/python.mk \
    ./usr/share/python3/runtime.d/public_modules.rtinstall \
    ./usr/share/python3/runtime.d/public_modules.rtremove\
"
FILES_python3-minimal = " \
    ./usr/bin/py3clean \
    ./usr/bin/py3compile \
    ./usr/bin/py3versions \
    ./usr/bin/python3 \
    ./usr/bin/python3m \
    ./usr/share/doc/python3-minimal/README.Debian \
    ./usr/share/doc/python3-minimal/changelog.Debian.gz \
    ./usr/share/doc/python3-minimal/copyright \
    ./usr/share/man/man1/py3clean.1.gz \
    ./usr/share/man/man1/py3compile.1.gz \
    ./usr/share/man/man1/py3versions.1.gz \
    ./usr/share/man/man1/python3.1.gz \
    ./usr/share/man/man1/python3m.1.gz \
    ./usr/share/python3/debian_defaults \
    ./usr/share/python3/debpython/__init__.py \
    ./usr/share/python3/debpython/files.py \
    ./usr/share/python3/debpython/interpreter.py \
    ./usr/share/python3/debpython/option.py \
    ./usr/share/python3/debpython/version.py \
    ./usr/share/python3/py3versions.py\
"
